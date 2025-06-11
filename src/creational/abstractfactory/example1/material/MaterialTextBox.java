package creational.abstractfactory.example1.material;

import creational.abstractfactory.example1.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
