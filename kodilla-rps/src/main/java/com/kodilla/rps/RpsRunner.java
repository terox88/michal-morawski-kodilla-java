package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Launcher launch = new Launcher();
        boolean end = false;
        while (!end) {
            end = launch.launchGame();
        }
        System.out.println("Thank you for playing :)");



    }
}
