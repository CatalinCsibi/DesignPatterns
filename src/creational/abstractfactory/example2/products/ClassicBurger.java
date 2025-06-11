package creational.abstractfactory.example2.products;

public class ClassicBurger implements Burger {

    @Override
    public void prepare() {
        // Logic relevant to Classic Burgers
        System.out.println("Preparing Classic Burger...");
    }

}
