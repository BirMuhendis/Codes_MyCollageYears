package AbstractFactory.factory;

import AbstractFactory.Products.Chair.Chair;
import AbstractFactory.Products.CoffieeTable.Coffiee;
import AbstractFactory.Products.Sofa.Sofa;

public interface FurnitureFactory  {

    Sofa createSofa();
    Chair createChair();
    Coffiee createCoffiee();
    String toString();
}
