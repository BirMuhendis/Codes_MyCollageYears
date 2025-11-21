package AbstractFactory.factory;

import AbstractFactory.Products.Chair.Chair;
import AbstractFactory.Products.Chair.RusticChair;
import AbstractFactory.Products.CoffieeTable.Coffiee;
import AbstractFactory.Products.CoffieeTable.RusticCoffieeTable;
import AbstractFactory.Products.Sofa.RusticSofa;
import AbstractFactory.Products.Sofa.Sofa;

public class RusticFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() 
    {
        return new RusticSofa();
    }

    @Override
    public Chair createChair()
    {
        return new RusticChair();
    }

    @Override
    public Coffiee createCoffiee() 
    {
        return new RusticCoffieeTable();
    }

    @Override
    public String toString() {
        return "This is a Rustic Factory!";
    }
}
