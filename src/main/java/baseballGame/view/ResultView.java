package baseballGame.view;

import baseballGame.dto.BallAndStrike;
import baseballGame.result.Result;
import baseballGame.service.ResultService;

import java.util.List;

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

            System.out.println(Result.GAME_OVER.getMessage());
            System.out.println(Result.IS_RESTART.getMessage());
            return true;
        }
        return false;
    }

    public void nothing() {

        System.out.print(Result.NOTHING.getMessage() + "\n");
    }

    public void ball() {

        System.out.print(numOfBall + Result.BALL.getMessage() + "\n");
    }

    public void strike() {

        System.out.print(numOfStrike + Result.STRIKE.getMessage() + "\n");
    }

    public void ballStrike() {

        System.out.print(numOfBall + Result.BALL.getMessage() + " " + numOfStrike + Result.STRIKE.getMessage() + "\n");
    }
}
