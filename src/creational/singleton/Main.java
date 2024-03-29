package creational.singleton;

public class Main {

    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "John");

        ConfigManager other = ConfigManager.getInstance();

        System.out.println(other.get("name"));
    }
}
