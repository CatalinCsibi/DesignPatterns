package creational.abstractfactory.example2.products;

public class OrientalBurger implements Burger {

    @Override
    public void prepare() {
        // Logic relevant to Oriental Burgers
        System.out.println("Preparing Oriental Burger...");
    }

}
