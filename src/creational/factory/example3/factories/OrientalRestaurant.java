package creational.factory.example3.factories;


import creational.factory.example3.products.Burger;
import creational.factory.example3.products.OrientalBurger;

public class OrientalRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Oriental Burger...");
        return new OrientalBurger();
    }

}

