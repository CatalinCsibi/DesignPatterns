package creational.factory.example3.products;

public class ClassicBurger implements Burger {

    @Override
    public void prepare() {
        // Prepare Classic Burger
        System.out.println("Preparing Classic Burger...");
    }

}

