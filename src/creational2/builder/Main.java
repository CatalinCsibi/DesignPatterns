package creational2.builder;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("HDD", "RAM")
                .graphicsCardEnabled(true)
                .bluetoothEnabled(true)
                .build();

        System.out.println(computer.getHDD());
        System.out.println(computer.getRAM());
        System.out.println(computer.isGraphicsCardEnabled());
        System.out.println(computer.isBluetoothEnabled());

    }
}
