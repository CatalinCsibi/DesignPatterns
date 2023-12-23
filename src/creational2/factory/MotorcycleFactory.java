package creational2.factory;

public class MotorcycleFactory extends MotorVehicleFactory{

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
