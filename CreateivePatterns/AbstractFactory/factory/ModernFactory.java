package AbstractFactory.factory;

import AbstractFactory.Products.Chair.Chair;
import AbstractFactory.Products.Chair.ModernChair;
import AbstractFactory.Products.CoffieeTable.Coffiee;
import AbstractFactory.Products.CoffieeTable.ModernCoffieeTable;
import AbstractFactory.Products.Sofa.ModernSofa;
import AbstractFactory.Products.Sofa.Sofa;

public class ModernFactory implements FurnitureFactory {

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Coffiee createCoffiee() {
        return new ModernCoffieeTable();
    }

    @Override
    public String toString() {
        return "This is a Modern Factory!";
    }
}
