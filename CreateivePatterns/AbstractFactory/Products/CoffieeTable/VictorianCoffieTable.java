package AbstractFactory.Products.CoffieeTable;

public class VictorianCoffieTable implements Coffiee {
    @Override
    public void putOn() 
    {
        System.out.println("Put Coffiee");
    }

    @Override
    public String toString() 
    {
        return "this is a Rustic Coffiee Table";
    }
}

