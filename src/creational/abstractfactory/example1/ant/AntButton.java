package creational.abstractfactory.example1.ant;

import creational.abstractfactory.example1.Button;

public class AntButton implements Button {

    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
