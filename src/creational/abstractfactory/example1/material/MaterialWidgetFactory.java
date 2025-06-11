package creational.abstractfactory.example1.material;

import creational.abstractfactory.example1.Button;
import creational.abstractfactory.example1.TextBox;
import creational.abstractfactory.example1.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
