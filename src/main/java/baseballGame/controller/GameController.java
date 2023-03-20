package baseballGame.controller;

import baseballGame.dto.BallAndStrike;
import baseballGame.service.BallService;
import baseballGame.service.GameService;
import baseballGame.view.InputView;

import java.util.List;

public class GameController {

    private final BallService ballService = new BallService();
    private final GameService gameService = new GameService();
    private final InputView inputView = new InputView();

    public List<Integer> createBalls() {

        return ballService.createBalls();
    }

    public BallAndStrike compareBalls(List<Integer> computerBalls) {

        String myBalls = inputView.inputBalls();
        return gameService.compareBalls(computerBalls, myBalls);
    }

}
