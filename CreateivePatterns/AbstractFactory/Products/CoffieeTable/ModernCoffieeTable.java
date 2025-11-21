package AbstractFactory.Products.CoffieeTable;

public class ModernCoffieeTable implements Coffiee  {

    @Override
    public void putOn()
    {
    System.out.println("Put Coffiee");
    }

    @Override
    public String toString()
    {
        return "This is a Modern Coffie Table!";
    }
}
