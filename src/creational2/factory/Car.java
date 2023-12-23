package creational2.factory;

public class Car implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Building car");
    }
}
