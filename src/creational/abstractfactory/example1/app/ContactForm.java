package creational.abstractfactory.example1.app;

import creational.abstractfactory.example1.WidgetFactory;

public class ContactForm {

    public void render(WidgetFactory factory) {
        factory.createTextBox().render();;
        factory.createButton().render();
    }
}
