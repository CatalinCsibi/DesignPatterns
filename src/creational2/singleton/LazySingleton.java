package creational2.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public synchronized static LazySingleton instance() {
        if(instance == null)
            instance = new LazySingleton();

        return instance;
    }
}
