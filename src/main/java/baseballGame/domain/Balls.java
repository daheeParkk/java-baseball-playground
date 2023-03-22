package baseballGame.domain;

import java.util.List;

public class Balls {

    private final List<Integer> computerBalls;
    private final List<Integer> myBalls;

    public Balls(List<Integer> computerBalls, List<Integer> myBalls) {

        this.computerBalls = computerBalls;
        this.myBalls = myBalls;
    }

    public Boolean contains(int myBallsIndex) {

        return computerBalls.contains(myBalls.get(myBallsIndex));
    }

    public Boolean compare(int ballIndex) {

        return computerBalls.get(ballIndex).equals(myBalls.get(ballIndex));
    }

}
