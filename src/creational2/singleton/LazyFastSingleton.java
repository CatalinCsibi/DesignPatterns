package creational2.singleton;

public class LazyFastSingleton {

    private volatile static LazyFastSingleton instance;

    private LazyFastSingleton() {
    }

    public static LazyFastSingleton instance() {
        if(instance == null) {
            synchronized (LazyFastSingleton.class){
                if(instance == null) {
                    instance = new LazyFastSingleton();
                }
            }
        }
        return instance;
    }
}
