package creational2.factory;

public class Main {

    public static void main(String[] args) {

        MotorVehicleFactory factory = new CarFactory();

        MotorVehicle car = factory.createMotorVehicle();
        car.build();

    }
}
