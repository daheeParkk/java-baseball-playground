package baseballGame;

import baseballGame.service.GameService;

public class Main {

    public static void main(String[] args) {

        GameService baseballGame = new GameService();
        baseballGame.playGame();
    }
}
