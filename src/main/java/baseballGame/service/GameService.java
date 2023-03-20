package baseballGame.service;

import baseballGame.dto.BallAndStrike;
import baseballGame.view.InputView;
import baseballGame.view.ResultView;

import java.util.ArrayList;
import java.util.List;

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

        List<Integer> myBalls = stringToIntArr(inputBalls);

        int ball = 0;
        int strike = 0;

        for (int i = 0; i < myBalls.size(); i++) {

            ball += compareNum(computerBalls, myBalls, i);
            strike += comparePosition(computerBalls, myBalls, i);
        }

        ball -= strike;
        return new BallAndStrike(ball, strike);
    }

    private int compareNum(List<Integer> computerBalls, List<Integer> myBalls, int index) {

        if (computerBalls.contains(myBalls.get(index))) {

            return 1;
        }
        return 0;
    }

    private int comparePosition(List<Integer> computerBalls, List<Integer> myBalls, int i) {

        if (computerBalls.get(i).equals(myBalls.get(i))) {

            return 1;
        }
        return 0;
    }
}
