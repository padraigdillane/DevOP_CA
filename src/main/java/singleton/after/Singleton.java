package singleton.after;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton(){
        System.out.println("Creating Singleton");
    }

    public static Singleton getInstance(){
        if (singletonInstance == null){

            synchronized (Singleton.class){
                if (singletonInstance == null){
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
