package baseballGame.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallAndStrike {

    private final int ball;
    private final int strike;

    public BallAndStrike(int ball, int strike) {

        this.ball = ball;
        this.strike = strike;
    }

    public List<Integer> getBallAndStrike() {

        return new ArrayList<>(Arrays.asList(ball, strike));
    }

    public boolean ballIsZero() {

        return ball == 0;
    }

    public boolean ballIsNotZero() {

        return ball != 0;
    }

    public boolean strikeIsZero() {

        return strike == 0;
    }

    public boolean strikeIsThree() {

        return strike == 3;
    }
}
