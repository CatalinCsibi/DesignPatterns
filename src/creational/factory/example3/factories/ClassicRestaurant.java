package creational.factory.example3.factories;


import creational.factory.example3.products.Burger;
import creational.factory.example3.products.ClassicBurger;

public class ClassicRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Classic Burger...");
        return new ClassicBurger();
    }

}

