package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final Sauce sauce;
    private List<Ingredients> ingredients = new ArrayList<>();
    private final int burgers;

    public static class BigmacBuilder {

        private Bun bun;
        private Sauce sauce;
        private List<Ingredients> ingredients = new ArrayList<>();
        private int burgers;

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce (Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient (Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, ingredients, burgers);
        }
    }

    private Bigmac(final Bun bun, final Sauce sauce, List<Ingredients> ingredients, final int burgers) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
        this.burgers = burgers;
    }

    public Bun getBun() {
        return bun;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                ", burgers=" + burgers +
                '}';
    }
}
