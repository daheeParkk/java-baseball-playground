package baseballGame;

import java.util.ArrayList;

public class Game {

    int[] ballAndStrike = new int[2];
    private int strike;
    private int ball;

    public int[] compareBalls(ArrayList<Integer> computerBalls, ArrayList<Integer> myBalls) {

        for (int i = 0; i < myBalls.size(); i++) {

            compareNum(computerBalls, myBalls, i);
            comparePosition(computerBalls, myBalls, i);
        }

        ball -= strike;

        return createBallAndStrike(ball, strike);
    }

    private void compareNum(ArrayList<Integer> computerBalls, ArrayList<Integer> myBalls, int index) {

        if (computerBalls.contains(myBalls.get(index))) {

            ball++;
        }
    }

    private void comparePosition(ArrayList<Integer> computerBalls, ArrayList<Integer> myBalls, int i) {

        if (computerBalls.get(i).equals(myBalls.get(i))) {

            strike++;
        }
    }

    private int[] createBallAndStrike(int ball, int strike) {

        ballAndStrike[0] = ball;
        ballAndStrike[1] = strike;

        return ballAndStrike;
    }
}
