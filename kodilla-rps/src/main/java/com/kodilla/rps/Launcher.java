package com.kodilla.rps;

import java.util.Scanner;

public class Launcher {

    public boolean launchGame(){
        boolean result;
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Choose game version");
        System.out.println("1 -> Basic game\n2 -> Big Bang game");
        String answer = scanner.nextLine();
        if(answer.equals("1")) {
            result = game.simpleGame();
        } else if (answer.equals("2")) {
            result= game.bigBangGame();
        } else {
            System.out.println("Wrong command: starting basic game");
            result = game.simpleGame();
        }


        return result;

    }

}
