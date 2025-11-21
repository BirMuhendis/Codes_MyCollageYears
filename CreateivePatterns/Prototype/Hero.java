package Prototype;

public class Hero implements ClonePrototype {
    private String name;
    private int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public ClonePrototype clone() {
        return new Hero(this.name, this.level);
    }

    @Override
    public String toString() {
        return "Hero{name='" + name + "', level=" + level + "}";
    }
    
}
