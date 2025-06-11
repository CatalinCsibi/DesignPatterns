package creational.abstractfactory.example2.factories;


import creational.abstractfactory.example2.products.Burger;
import creational.abstractfactory.example2.products.Pizza;

public abstract class Restaurant {

    // Business logic can be added here or in another class

    public abstract Burger createBurger();

    public abstract Pizza createPizza();

}
