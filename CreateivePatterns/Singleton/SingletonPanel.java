package Singleton;

public class SingletonPanel {
    private int width;
    private int height;
    private String backgroundColor;
    private String borderStyle;
    private String title;
    private static SingletonPanel instance;

    private SingletonPanel() {}

    public static SingletonPanel getInstance(){
        if (instance==null)  instance = new SingletonPanel();
        return instance;
    }

    public static int setwidth(int width) 
    {
        SingletonPanel instance = getInstance();
        instance.width = width;
        return instance.width;
    }
    public static int setheight(int height) 
    {
        SingletonPanel instance = getInstance();
        instance.height = height;
        return instance.height;
    }
    public static String setbackgroundColor(String backgroundColor) 
    {
        SingletonPanel instance = getInstance();
        instance.backgroundColor = backgroundColor;
        return instance.backgroundColor;
    }
    public static String setborderStyle(String borderStyle) 
    {
        SingletonPanel instance = getInstance();
        instance.borderStyle = borderStyle;
        return instance.borderStyle;
    }
    public static String settitle(String title) 
    {
        SingletonPanel instance = getInstance();
        instance.title = title;
        return instance.title;
    }
    public String toString() {
        return "Panel [width=" + width + ", height=" + height + ", backgroundColor=" + backgroundColor + ", borderStyle="
                + borderStyle + ", title=" + title + "]";
    }
}
