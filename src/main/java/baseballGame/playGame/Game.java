package baseballGame.playGame;

import baseballGame.controller.GameController;
import baseballGame.domain.BallAndStrike;
import baseballGame.view.InputView;

import java.util.List;

public class Game {

    private final GameController gameController = new GameController();
    private final InputView inputView = new InputView();
    private int restart = 1;
    private List<Integer> computerBalls;
    public final static int RESTART_NUM = 1;

    public void play() {

        while (restart == RESTART_NUM) {

            computerBalls = gameController.createBalls();
            start();
        }
    }

    private void start() {

        Boolean answer = false;

        while (!answer) {

            BallAndStrike ballAndStrike = gameController.compareBalls(computerBalls);
            answer = gameController.resultOutput(ballAndStrike);
        }

        restart = inputView.restart();
    }
}
