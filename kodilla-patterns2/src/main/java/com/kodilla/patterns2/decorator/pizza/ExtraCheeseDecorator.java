package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator{
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("extra cheese");
        return ingredients;
    }
}
