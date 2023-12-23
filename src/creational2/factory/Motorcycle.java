package creational2.factory;

public class Motorcycle implements MotorVehicle{

    @Override
    public void build() {
        System.out.println("Building motorcycle");
    }
}
