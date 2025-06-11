package creational.abstractfactory.example1.material;

import creational.abstractfactory.example1.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
