package creational.abstractfactory.example2.factories;


import creational.abstractfactory.example2.products.Burger;
import creational.abstractfactory.example2.products.ClassicBurger;
import creational.abstractfactory.example2.products.ClassicPizza;
import creational.abstractfactory.example2.products.Pizza;

public class ClassicRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new ClassicBurger();
    }

    @Override
    public Pizza createPizza() {
        return new ClassicPizza();
    }

}
