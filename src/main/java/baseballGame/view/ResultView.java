package baseballGame.view;

import baseballGame.dto.BallAndStrike;
import baseballGame.ui.Input;
import baseballGame.ui.Result;
import baseballGame.service.ResultService;

import java.util.List;

import static baseballGame.ui.Input.*;
import static baseballGame.ui.Result.*;

public class ResultView {

    private static int numOfBall;
    private static int numOfStrike;

    public Boolean resultOutput(BallAndStrike result) {

        ResultService resultService = new ResultService();
        List<Integer> ballAndStrike = result.getBallAndStrike();

        numOfBall = ballAndStrike.get(0);
        numOfStrike = ballAndStrike.get(1);

        Boolean isThreeStrike = resultService.separationOfAnswer(result);

        if (isThreeStrike) {

            System.out.println(GAME_OVER.getMessage());
            System.out.println(IS_RESTART.getMessage());
            return true;
        }
        return false;
    }

    public void nothing() {

        System.out.print(NOTHING.getMessage() + "\n");
    }

    public void ball() {

        System.out.print(numOfBall + BALL.getMessage() + "\n");
    }

    public void strike() {

        System.out.print(numOfStrike + STRIKE.getMessage() + "\n");
    }

    public void ballStrike() {

        System.out.print(numOfBall + BALL.getMessage() + " " + numOfStrike + STRIKE.getMessage() + "\n");
    }
}
