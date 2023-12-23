package structural.bridge;

public class SonnyTV implements Device{

    @Override
    public void turnOn() {
        System.out.println("Sonny: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sonny: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sonny: setChannel");
    }
}
