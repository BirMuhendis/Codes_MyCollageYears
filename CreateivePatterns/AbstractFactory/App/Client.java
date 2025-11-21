package AbstractFactory.App;

import AbstractFactory.factory.FurnitureFactory;
import AbstractFactory.Products.Chair.Chair;
import AbstractFactory.Products.CoffieeTable.Coffiee;
import AbstractFactory.Products.Sofa.Sofa;

public class Client {
    Sofa Sofa;
    Chair Chair;
    Coffiee Coffiee;

    public Client(){}

    public Client(FurnitureFactory ff)
    {
        this.Sofa=ff.createSofa();
        this.Chair= ff.createChair();
        this.Coffiee=ff.createCoffiee();
    }

    public void showItems()
    {
        Sofa.toString();
        Chair.toString();
        Coffiee.toString();
    }

    public void useFurniture()
    {
        Sofa.lieOn();
        Chair.sitOn();
        Coffiee.putOn();
    }

    public String toString() {
        return "Client{" +
                "Sofa=" + Sofa.toString() +
                ", Chair=" + Chair.toString() +
                ", Coffiee=" + Coffiee.toString() +
                '}';
    }
}
