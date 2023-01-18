package com.kodilla.testing;

import com.kodilla.testing.calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("\nSimple calculator test");
        SimpleCalculator calculator = new SimpleCalculator();
        int sum = calculator.addAToB(4, 6);
        int subtract = calculator.subtractAFromB(3, 6);
       if(sum == 10) {
           System.out.println("Test for adding method: ok");
       } else {
           System.out.println("Test for adding method: error");
       }
       if(subtract == -3) {
           System.out.println("Test for subtract method: ok");
       } else {
           System.out.println("Test for subtract method: error");
       }

    }
}
