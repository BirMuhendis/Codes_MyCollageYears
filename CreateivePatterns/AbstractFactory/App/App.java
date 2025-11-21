package AbstractFactory.App;

import AbstractFactory.factory.ModernFactory;
import AbstractFactory.factory.RusticFactory;
import AbstractFactory.factory.VictorianFacttory;

public class App {

    public static void main(String[] args) {
        System.out.println("**************Modern Furniture Factory**************");
        ModernFactory mf = new ModernFactory();
        Client modernclient = new Client(mf);
        System.out.println(modernclient);
        modernclient.useFurniture();

        System.out.println("****************************Victorian Furniture Factory****************************");

        VictorianFacttory vf = new VictorianFacttory();
        Client victorianclient = new Client(vf);
        System.out.println(victorianclient);
        modernclient.useFurniture();
        System.out.println("****************************Rustic Furniture Factory****************************");

        RusticFactory rf = new RusticFactory();
        Client rusticclient = new Client(rf);
        System.out.println(rusticclient);
        modernclient.useFurniture();
    }
}
