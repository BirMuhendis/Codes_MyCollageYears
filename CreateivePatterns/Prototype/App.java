package Prototype;

public class App {
    public static void main(String[] args) {
        Hero originalHero = new Hero("Archer", 5);
        System.out.println("Original Hero: " + originalHero);

        Hero clonedHero = (Hero) originalHero.clone();
        System.out.println("Cloned Hero: " + clonedHero);
    }
}
