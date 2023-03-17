package baseballGame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BaseballGameTest {

    @Test
    void createBallsTest() {

        Balls balls = new Balls();
        ArrayList<Integer> computerBalls = balls.createBalls();

        assertThat(computerBalls.size()).isEqualTo(3);
    }

    @Test
    void compareBallsTest() {

        ArrayList<Integer> computerBalls = new ArrayList<>();
        ArrayList<Integer> myBalls = new ArrayList<>();
        computerBalls.add(1);
        computerBalls.add(2);
        computerBalls.add(3);
        myBalls.add(1);
        myBalls.add(2);
        myBalls.add(3);
        Game game = new Game();

        int[] ballAndStrike = game.compareBalls(computerBalls, myBalls);
        int numOfBall = ballAndStrike[0];
        int numOfStrike = ballAndStrike[1];

        assertThat(numOfBall).isEqualTo(0);
        assertThat(numOfStrike).isEqualTo(3);
    }
}

