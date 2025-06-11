package creational.factory.example2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle.

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw(); // Output: Drawing a Square.
    }
}

