package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Launcher launch = new Launcher();
        boolean win = false;
        while (!win) {
            win = launch.launchGame();
        }
        System.out.println("Thank you for playing :)");


    }
}
