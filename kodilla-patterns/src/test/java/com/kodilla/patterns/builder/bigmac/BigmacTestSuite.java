package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder () {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .sauce(Sauce.BARBEQUE)
                .ingredient(Ingredients.MUSHROOMS)
                .ingredient(Ingredients.BACON)
                .burgers(2)
                .ingredient(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        assertEquals(3, numberOfIngredients);
        assertEquals(2, howManyBurgers);
    }
    @Test
    void testBigmacBuilderWithoutSauce() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .ingredient(Ingredients.MUSHROOMS)
                .ingredient(Ingredients.BACON)
                .burgers(2)
                .ingredient(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);
        //When
        Sauce sauce = bigmac.getSauce();

        //Then
        assertNull(sauce);
    }

}
