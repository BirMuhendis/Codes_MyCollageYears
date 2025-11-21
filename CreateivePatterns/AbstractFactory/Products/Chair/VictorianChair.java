package AbstractFactory.Products.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() 
    {
        System.out.println("sitOn");
    }

    @Override
    public String toString() 
    {
        return "This is a Victorian Chair!";
    }
}
