package creational.factory.example3;


import creational.factory.example3.factories.ClassicRestaurant;
import creational.factory.example3.factories.OrientalRestaurant;
import creational.factory.example3.factories.Restaurant;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/EdFq_JIThqM
     */
    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();

    }

}
