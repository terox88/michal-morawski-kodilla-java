package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20);
    }
    @Override
    public List<String> getIngredients() {
        List<String> ingredients =new ArrayList<>();
        ingredients.add("cheese");
        ingredients.add("tomato sauce");
        return ingredients;
    }
}
