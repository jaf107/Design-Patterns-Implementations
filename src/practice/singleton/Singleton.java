package practice.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("sup");
    }
}
