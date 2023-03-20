package baseballGame;

import baseballGame.dto.BallAndStrike;
import baseballGame.service.BallService;
import baseballGame.service.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        GameService game = new GameService();
        List<Integer> computerBalls = Arrays.asList(1, 2, 3);
        String myBalls = "123";
        BallAndStrike ballAndStrike = game.compareBalls(computerBalls, myBalls);
        assertThat(ballAndStrike.getBallAndStrike()).isEqualTo(Arrays.asList(0, 3));
    }
}

