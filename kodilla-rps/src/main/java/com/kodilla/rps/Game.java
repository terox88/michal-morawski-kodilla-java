package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private int playerPoints;
    private int opponentPoints;
    private String name;
    private List<String> moves;

    public Game() {
        moves = new ArrayList<>();
        moves.add("Paper");
        moves.add("Stone");
        moves.add("Scissors");
        moves.add("Spock");
        moves.add("Lizard");
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNewGame() {
        this.opponentPoints = 0;
        this.playerPoints = 0;
        this.name = null;
    }

    public boolean simpleGame() {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        TheOpponent opponent = new TheOpponent();
        String answer;
        boolean win = false;
        System.out.println("Enter you name");
        this.name = scanner.nextLine();
        System.out.println("Choose points limits");
        int points = Integer.parseInt(scanner.nextLine());
        Launcher launcher = new Launcher();

        while (points == 0) {
            System.out.println("Limit must be grater than 0");
            System.out.println("Choose points limits");
            points = Integer.parseInt(scanner.nextLine());
        }
        while (!win) {
            System.out.println("Make a move\n1 -> Paper\n2 -> Stone\n3 -> Scissors");
            System.out.println("\"x\" for end or \"n\" for new game");
            boolean p1Win = false;
            String playerMove = scanner.nextLine();
            int opponentMove = opponent.makeAMove(4);

            switch (playerMove) {
                case "1":
                    if (opponentMove == 2) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 3) {
                        opponentPoints++;
                    }
                    break;
                case "2":
                    if (opponentMove == 3) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 1) {
                        opponentPoints++;
                    }
                    break;
                case "3":
                    if (opponentMove == 1) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 2) {
                        opponentPoints++;
                    }
                    break;
                case "x":
                    System.out.println("Are you sure you want to quit? \"y\" for yes : \"n\" for no");
                    answer = scanner.nextLine();
                    if (answer.equals("y")) {
                        win = true;
                        result = true;
                    }
                    break;
                case "n":
                    System.out.println("Are you sure you want to start new game? \"y\" for yes : \"n\" for no");
                    answer = scanner.nextLine();
                    if (answer.equals("y")) {
                        setNewGame();
                        launcher.launchGame();
                    }
                    break;
                default:
                    System.out.println("Wrong move try again");
            }
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                System.out.println(name + " move: " + moves.get((Integer.parseInt(playerMove)) - 1) + " -- " + "Opponent move: " + moves.get(opponentMove - 1));
                if (p1Win) {
                    System.out.println(name + " wins this round");
                } else if (Integer.parseInt(playerMove) == opponentMove) {
                    System.out.println("It's a draw");
                } else {
                    System.out.println("Opponent wins this round");
                }
                if (playerPoints == points || opponentPoints == points) win = true;
                if (!win) {
                    System.out.println(name + " points: " + playerPoints);
                    System.out.println("Opponent points: " + opponentPoints);
                }

                if (win) {
                    System.out.println("Congratulations!!!");
                    if (playerPoints > opponentPoints) {
                        System.out.println(name + " wins");

                    } else {
                        System.out.println("Opponent wins");
                    }
                    System.out.println(name + " points: " + playerPoints);
                    System.out.println("Opponent points: " + opponentPoints);
                    System.out.println("Choose \"x\" for end or any key for new game");
                    String endGame = scanner.nextLine();
                    if (endGame.equals("x")) {
                        result = true;
                    } else {
                        setNewGame();
                        launcher.launchGame();
                    }
                }
            }
        }
        return result;
    }

    public boolean bigBangGame() {
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        TheOpponent opponent = new TheOpponent();
        String answer;
        boolean win = false;
        System.out.println("Enter you name");
        this.name = scanner.nextLine();
        System.out.println("Choose points limits");
        int points = Integer.parseInt(scanner.nextLine());
        Launcher launcher = new Launcher();

        while (points <= 0) {
            System.out.println("Limit must be grater than 0");
            System.out.println("Choose points limits");
            points = Integer.parseInt(scanner.nextLine());
        }
        while (!win) {
            System.out.println("Make a move\n1 -> Paper\n2 -> Stone\n3 -> Scissors\n4 -> Spock\n5 -> Lizard");
            System.out.println("\"x\" for end or \"n\" for new game");
            boolean p1Win = false;
            String playerMove = scanner.nextLine();
            int opponentMove = opponent.makeAMove(6);

            switch (playerMove) {
                case "1":
                    if (opponentMove == 2 || opponentMove == 4) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 3 || opponentMove == 5) {
                        opponentPoints++;
                    }
                    break;
                case "2":
                    if (opponentMove == 3 || opponentMove == 5) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 1 || opponentMove == 4) {
                        opponentPoints++;
                    }
                    break;
                case "3":
                    if (opponentMove == 1 || opponentMove == 5) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 2 || opponentMove == 4) {
                        opponentPoints++;
                    }
                    break;
                case"4":
                    if (opponentMove == 2 || opponentMove == 3) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 1 || opponentMove == 5) {
                        opponentPoints++;
                    }
                    break;
                case "5":
                    if (opponentMove == 1 || opponentMove == 4) {
                        playerPoints++;
                        p1Win = true;
                    } else if (opponentMove == 2 || opponentMove == 3) {
                        opponentPoints++;
                    }
                    break;
                case "x":
                    System.out.println("Are you sure you want to quit? \"y\" for yes : \"n\" for no");
                    answer = scanner.nextLine();
                    if (answer.equals("y")) {
                        win = true;
                        result = true;
                    }
                    break;
                case "n":
                    System.out.println("Are you sure you want to start new game? \"y\" for yes : \"n\" for no");
                    answer = scanner.nextLine();
                    if (answer.equals("y")) {
                        setNewGame();
                        launcher.launchGame();
                    }
                    break;
                default:
                    System.out.println("Wrong move try again");
            }
            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3") || playerMove.equals("4") || playerMove.equals("5")) {
                System.out.println(name + " move: " + moves.get((Integer.parseInt(playerMove)) - 1) + " -- " + "Opponent move: " + moves.get(opponentMove - 1));
                if (p1Win) {
                    System.out.println(name + " wins this round");
                } else if (Integer.parseInt(playerMove) == opponentMove) {
                    System.out.println("It's a draw");
                } else {
                    System.out.println("Opponent wins this round");
                }
                if (playerPoints == points || opponentPoints == points) win = true;
                if (!win) {
                    System.out.println(name + " points: " + playerPoints);
                    System.out.println("Opponent points: " + opponentPoints);
                }

                if (win) {
                    System.out.println("Congratulations!!!");
                    if (playerPoints > opponentPoints) {
                        System.out.println(name + " wins");

                    } else {
                        System.out.println("Opponent wins");
                    }
                    System.out.println(name + " points: " + playerPoints);
                    System.out.println("Opponent points: " + opponentPoints);
                    System.out.println("Choose \"x\" for end or any key for new game");
                    String endGame = scanner.nextLine();
                    if (endGame.equals("x")) {
                        result = true;
                    } else {
                        setNewGame();
                        launcher.launchGame();
                    }
                }
            }
        }
        return result;
    }
}

