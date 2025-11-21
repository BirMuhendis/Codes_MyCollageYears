package AbstractFactory.Products.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() 
    {
        System.out.println("Lie on");        
    }

    @Override
    public String toString() 
    {
       return "This is a Modern Sofa";
    }
}
