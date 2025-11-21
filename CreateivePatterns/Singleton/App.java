package Singleton;

public class App {
    
    public static void main(String[] args) {
        SingletonPanel panel1 = SingletonPanel.getInstance();
        SingletonPanel.setbackgroundColor("Black");
        SingletonPanel.setborderStyle("Solid");
        SingletonPanel.setwidth(640);
        SingletonPanel.setheight(480);
        SingletonPanel.settitle("Panel 1");
        System.out.println(panel1);
        
        System.out.println("***************************************");

        SingletonPanel panel2 = SingletonPanel.getInstance();
        SingletonPanel.setbackgroundColor("Purple");
        SingletonPanel.setborderStyle("Dashed");
        SingletonPanel.setwidth(800);
        SingletonPanel.setheight(600);
        SingletonPanel.settitle("Panel 2");
        System.out.println(panel1);

        System.out.println("***************************************");
        System.out.println("Then we check that both panel1 and panel2 are the same instance:");
        System.out.println("panel1 hashCode: " + panel1.hashCode());
        System.out.println("panel2 hashCode: " + panel2.hashCode());
        System.out.println("Also ");
        System.out.println("Panel 1 ====>" + panel1);
        System.out.println("Panel 2 ====>" + panel2);

    }
}
