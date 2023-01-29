package com.kodilla.rps;

import java.util.Random;

public class TheOpponent {
    Random generator;
    public TheOpponent() {
        this.generator = new Random();
    }

    public int makeAMove(int bound) {
      return generator.nextInt(1,bound);
    }
}
