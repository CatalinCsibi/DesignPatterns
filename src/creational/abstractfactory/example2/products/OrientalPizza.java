package creational.abstractfactory.example2.products;

public class OrientalPizza implements Pizza {

    @Override
    public void bake() {
        // Logic relevant to Oriental Pizzas
        System.out.println("Baking Oriental Pizza...");
    }

}
