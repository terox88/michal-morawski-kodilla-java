package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        // Countries for Europe
        List<Country> europeList = new ArrayList<>();
        europeList.add(new Country("Poland", new BigDecimal(39456745)));
        europeList.add(new Country("Great Britain", new BigDecimal(49678143)));
        europeList.add(new Country("France", new BigDecimal(56789567)));
        europeList.add(new Country("Germany", new BigDecimal(49876435)));
        europeList.add(new Country("Spain", new BigDecimal(40987653)));
        Continent europe = new Continent("Europe", europeList);
        //Countries for Asia
        List<Country> asiaList = new ArrayList<>();
        asiaList.add(new Country("China", new BigDecimal(1446578967)));
        asiaList.add(new Country("Laos", new BigDecimal(6680345)));
        asiaList.add(new Country("India", new BigDecimal(1546478967)));
        asiaList.add(new Country("Nepal", new BigDecimal(34876984)));
        Continent asia = new Continent("Asia", asiaList);
        //Countries for North America
        List<Country> americaList = new ArrayList<>();
        americaList.add(new Country("Mexico", new BigDecimal(107563903)));
        americaList.add(new Country("Canada", new BigDecimal(33989040)));
        americaList.add(new Country("USA", new BigDecimal(308878120)));
        americaList.add(new Country("Cuba", new BigDecimal(13346676)));
        Continent northAmerica = new Continent("North America", americaList);
        // Making the world
        List<Continent> worldList = new ArrayList<>();
        worldList.add(europe);
        worldList.add(asia);
        worldList.add(northAmerica);
        World world = new World(worldList);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("3735181545");
        Assertions.assertEquals(expectedQuantity, result);

    }
}
