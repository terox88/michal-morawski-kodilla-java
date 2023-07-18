package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class SalamiPizzaDecorator extends AbstractPizzaOrderDecorator {
    public SalamiPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }
    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("salami");
        return ingredients;
    }
}
