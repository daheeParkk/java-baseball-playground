package baseballGame;

import baseballGame.service.BallService;
import baseballGame.service.GameService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BaseballGameTest {

    @Test
    void createBallsTest() {

        BallService balls = new BallService();
        List<Integer> computerBalls = balls.createBalls();

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
        GameService game = new GameService();

        int[] ballAndStrike = game.compareBalls(computerBalls, myBalls);
        int numOfBall = ballAndStrike[0];
        int numOfStrike = ballAndStrike[1];

        assertThat(numOfBall).isEqualTo(2);
        assertThat(numOfStrike).isEqualTo(1);
    }
}

