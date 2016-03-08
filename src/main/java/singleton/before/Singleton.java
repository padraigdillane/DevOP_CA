package singleton.before;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton(){
        System.out.println("Creating Singleton");
    }
    public static Singleton getInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
