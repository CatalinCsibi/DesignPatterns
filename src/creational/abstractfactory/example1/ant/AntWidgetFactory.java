package creational.abstractfactory.example1.ant;

import creational.abstractfactory.example1.Button;
import creational.abstractfactory.example1.TextBox;
import creational.abstractfactory.example1.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
