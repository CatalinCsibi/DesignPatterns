package creational2.factory2;

public class Main {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("PC", "RAM", "HDD", "CPU");
        System.out.println(pc.getRAM());
        System.out.println(pc.getHDD());
        System.out.println(pc.getCPU());

    }
}
