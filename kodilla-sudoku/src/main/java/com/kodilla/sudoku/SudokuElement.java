package com.kodilla.sudoku;

import java.util.LinkedList;
import java.util.List;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;
   private final List<Integer> possibleNumbers = new LinkedList<>();

   public SudokuElement(int value) {
       this.value = value;
       for(int i = 1; i < 10; i++ ) {
           possibleNumbers.add(i);
       }
   }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }
}
