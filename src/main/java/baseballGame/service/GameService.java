package baseballGame.service;

import baseballGame.dto.BallAndStrike;
import baseballGame.dto.Balls;

import java.util.ArrayList;
import java.util.List;

import static baseballGame.service.BallService.*;

public class GameService {

    private List<Integer> stringToIntArr(String inputBalls) {

        ArrayList<Integer> myBalls = new ArrayList<>();
        String[] inputBall = inputBalls.split("");

        for (String s : inputBall) {

            myBalls.add(Integer.parseInt(s));
        }

        return myBalls;
    }

    public BallAndStrike compareBalls(List<Integer> computerBalls, String inputBalls) {

        int ball = 0;
        int strike = 0;

        List<Integer> myBalls = stringToIntArr(inputBalls);
        Balls balls = new Balls(computerBalls, myBalls);

        for (int i = 0; i < NUMBER_OF_BALLS; i++) {

            ball += compareNum(balls, i);
            strike += comparePosition(balls, i);
        }

        ball -= strike;
        return new BallAndStrike(ball, strike);
    }

    private int compareNum(Balls balls, int myBallsIndex) {

        if (balls.contains(myBallsIndex)) {

            return 1;
        }
        return 0;
    }

    private int comparePosition(Balls balls, int ballsIndex) {

        if (balls.compare(ballsIndex)) {

            return 1;
        }
        return 0;
    }
}
