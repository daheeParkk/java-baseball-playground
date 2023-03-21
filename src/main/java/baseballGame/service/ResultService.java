package baseballGame.service;

import baseballGame.dto.BallAndStrike;
import baseballGame.view.ResultView;

public class ResultService {

    private final ResultView resultView = new ResultView();

    public Boolean separationOfAnswer(BallAndStrike result) {

        if (result.ballIsZero() && result.strikeIsZero()) {

            resultView.nothing();
            return false;
        }
        if (!result.ballIsZero() && result.strikeIsZero()) {

            resultView.ball();
            return false;
        }
        if (result.ballIsZero()) {

            resultView.strike();
            return result.strikeIsThree();
        }
        resultView.ballStrike();
        return false;
    }
}
