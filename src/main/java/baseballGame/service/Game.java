package baseballGame.service;

import baseballGame.view.InputView;
import baseballGame.view.ResultView;

import java.util.ArrayList;

public class Game {

    int[] ballAndStrike = new int[2];

    Balls balls = new Balls();
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();

    public void playGame() {

        ArrayList<Integer> computerBalls = balls.createBalls();
        ArrayList<Integer> myBalls;
        int[] ballAndStrike;
        Boolean answer = false;

        while (!answer) {

            myBalls = stringToIntArr(inputView.inputBalls());
            ballAndStrike = compareBalls(computerBalls, myBalls);
            answer = resultView.hintOutput(ballAndStrike);
        }

        inputView.restart();
    }

    private ArrayList<Integer> stringToIntArr(String inputBalls) {

        ArrayList<Integer> myBalls = new ArrayList<>();
        String[] inputBall = inputBalls.split("");

        for (String s : inputBall) {

            myBalls.add(Integer.parseInt(s));
        }

        return myBalls;
    }

    public int[] compareBalls(ArrayList<Integer> computerBalls, ArrayList<Integer> myBalls) {

        int ball = 0;
        int strike = 0;

        for (int i = 0; i < myBalls.size(); i++) {

            ball += compareNum(computerBalls, myBalls, i);
            strike += comparePosition(computerBalls, myBalls, i);
        }

        ball -= strike;

        return createBallAndStrike(ball, strike);
    }

    private int compareNum(ArrayList<Integer> computerBalls, ArrayList<Integer> myBalls, int index) {

        if (computerBalls.contains(myBalls.get(index))) {

            return 1;
        }
        return 0;
    }

    private int comparePosition(ArrayList<Integer> computerBalls, ArrayList<Integer> myBalls, int i) {

        if (computerBalls.get(i).equals(myBalls.get(i))) {

            return 1;
        }
        return 0;
    }

    private int[] createBallAndStrike(int ball, int strike) {

        ballAndStrike[0] = ball;
        ballAndStrike[1] = strike;

        return ballAndStrike;
    }
}
