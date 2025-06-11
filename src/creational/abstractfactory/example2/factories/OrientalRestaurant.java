package creational.abstractfactory.example2.factories;


import creational.abstractfactory.example2.products.Burger;
import creational.abstractfactory.example2.products.OrientalBurger;
import creational.abstractfactory.example2.products.OrientalPizza;
import creational.abstractfactory.example2.products.Pizza;

public class OrientalRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza createPizza() {
        return new OrientalPizza();
    }

}