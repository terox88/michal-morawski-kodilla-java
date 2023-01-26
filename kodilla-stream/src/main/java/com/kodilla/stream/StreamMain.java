package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beauty1 = poemBeautifier.beautify("Poem", s -> "ABC" + s + "ABC");
        String beauty2 = poemBeautifier.beautify("Poem", s -> s.toUpperCase());
        String beauty3 = poemBeautifier.beautify("Poem", s -> s.replace('e', 'E'));
        String beauty4 = poemBeautifier.beautify("Poem", s -> "O_O" + s + "^^");
        System.out.println(beauty1);
        System.out.println(beauty2);
        System.out.println(beauty3);
        System.out.println(beauty4);

    }
}
