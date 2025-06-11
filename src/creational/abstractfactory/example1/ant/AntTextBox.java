package creational.abstractfactory.example1.ant;

import creational.abstractfactory.example1.TextBox;

public class AntTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
