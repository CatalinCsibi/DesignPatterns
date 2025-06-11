package creational.abstractfactory.example1;

import creational.abstractfactory.example1.ant.AntWidgetFactory;
import creational.abstractfactory.example1.app.ContactForm;

public class Main {

    public static void main(String[] args) {

        new ContactForm().render(new AntWidgetFactory());
    }
}
