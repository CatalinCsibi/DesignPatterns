package creational.abstractfactory.example2;

import creational.abstractfactory.example2.factories.ClassicRestaurant;
import creational.abstractfactory.example2.factories.OrientalRestaurant;
import creational.abstractfactory.example2.factories.Restaurant;
import creational.abstractfactory.example2.products.Burger;
import creational.abstractfactory.example2.products.Pizza;

public class MainApp {


    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        Restaurant classicRestaurant = new ClassicRestaurant();

        Pizza classicPizza = classicRestaurant.createPizza();
        Burger classicBurger = classicRestaurant.createBurger();
        Pizza orientalPizza = orientalRestaurant.createPizza();
        Burger orientalBurger = orientalRestaurant.createBurger();

    }

}
