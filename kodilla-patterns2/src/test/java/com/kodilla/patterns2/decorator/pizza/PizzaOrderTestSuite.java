package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    void extraCheesePizzaGetCostTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(25), calculatedCost);
    }
    @Test
    void fullPizzaTestIngredientsTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new MushroomPizzaDecorator(order);
        order = new SalamiPizzaDecorator(order);
        //When
        int ingredientQuantity = order.getIngredients().size();
        //Then
        Assertions.assertEquals(5, ingredientQuantity);
    }
    @Test
    void fullPizzaTestCostTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new MushroomPizzaDecorator(order);
        order = new SalamiPizzaDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(38), calculatedCost);
    }
}
