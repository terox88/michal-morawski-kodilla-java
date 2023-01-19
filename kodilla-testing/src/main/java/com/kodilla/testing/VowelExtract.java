package com.kodilla.testing;

import java.util.ArrayList;
import java.util.List;

public class VowelExtract {
  private List<Character> vovelList;

    public VowelExtract() {
        vovelList = new ArrayList<>();
        vovelList.add('i');
        vovelList.add('I');
        vovelList.add('y');
        vovelList.add('Y');
        vovelList.add('e');
        vovelList.add('E');
        vovelList.add('a');
        vovelList.add('A');
        vovelList.add('o');
        vovelList.add('O');
        vovelList.add('u');
        vovelList.add('U');
        vovelList.add('Ę');


    }
    public String extract(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if(vovelList.contains(text.charAt(i))) {
                result += text.charAt(i);
            }
        }
            return result;
    }
}
