package baseballGame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class BaseballGameTest {

    @Test
    void createBallsTest() {

        Balls balls = new Balls();
        ArrayList<Integer> computerBalls = balls.createBalls();

        assertThat(computerBalls.size()).isEqualTo(3);
    }
}
