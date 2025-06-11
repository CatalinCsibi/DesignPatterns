package creational.factory.example1.sharp;

import creational.factory.example1.matcha.Controller;
import creational.factory.example1.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
