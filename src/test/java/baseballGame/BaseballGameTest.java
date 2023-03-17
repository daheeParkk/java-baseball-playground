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
        computerBalls.add(8);
        computerBalls.add(7);
        computerBalls.add(5);
        myBalls.add(5);
        myBalls.add(7);
        myBalls.add(8);
        Game game = new Game();

        int[] ballAndStrike = game.compareBalls(computerBalls, myBalls);
        int numOfBall = ballAndStrike[0];
        int numOfStrike = ballAndStrike[1];

        assertThat(numOfBall).isEqualTo(2);
        assertThat(numOfStrike).isEqualTo(1);
    }
}

