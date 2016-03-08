package singleton.before;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainSingleton {
    public static void main(String[] args) {
        build();
    }

    public static void violateSingleton(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }

    public static void build(){
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(mainSingleton ::violateSingleton);
        service.submit(mainSingleton ::violateSingleton);
        service.shutdown();
    }
}
