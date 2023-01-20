package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        for(Iterator<Integer> it = numbers.iterator(); it.hasNext();) {
            Integer number = it.next();
            if(number % 2 != 0) {
                it.remove();
            }
        }
        return numbers;
    }
}
