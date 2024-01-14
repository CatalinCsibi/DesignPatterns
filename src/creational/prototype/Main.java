package creational.prototype;

public class Main {

    public static void main(String[] args) {

        Component circle = new Circle();
        Component circle2 = circle.clone();

        System.out.println(circle + "------" + circle2);
    }
}
