package creational.factory.example1.sharp;

import creational.factory.example1.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
