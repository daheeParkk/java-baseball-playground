package main;

import game.NumbersBaseballGame;

public class Main {

    public static void main(String[] args) {

        String checkCorrectAnswer = "1";

        while (checkCorrectAnswer.equals("1")) {

            NumbersBaseballGame numbersBaseballGame = new NumbersBaseballGame();
            checkCorrectAnswer = numbersBaseballGame.startGame();
        }
    }
}
