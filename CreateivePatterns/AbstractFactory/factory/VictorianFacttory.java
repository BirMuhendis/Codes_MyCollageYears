package AbstractFactory.factory;

import AbstractFactory.Products.Chair.Chair;
import AbstractFactory.Products.Chair.VictorianChair;
import AbstractFactory.Products.CoffieeTable.Coffiee;
import AbstractFactory.Products.CoffieeTable.VictorianCoffieTable;
import AbstractFactory.Products.Sofa.Sofa;
import AbstractFactory.Products.Sofa.VictorianSofa;

public class VictorianFacttory implements FurnitureFactory {

    @Override
    public Sofa createSofa() {
       return new VictorianSofa();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Coffiee createCoffiee() {
        return new VictorianCoffieTable();
    }

    @Override
    public String toString() {
        return "This is a Victorian Factory!";
    }
}
