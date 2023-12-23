package creational2.singleton;

public class Main {

    public static void main(String[] args) {

        EagerSingleton eagerSingleton = EagerSingleton.instance();
        EagerSingleton eagerSingleton2 = EagerSingleton.instance();

        LazySingleton lazySingleton = LazySingleton.instance();
        LazySingleton lazySingleton1 = LazySingleton.instance();

        System.out.println(eagerSingleton2 == eagerSingleton);
        System.out.println(lazySingleton == lazySingleton1);

        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;

        System.out.println(s1 == s2);

    }
}
