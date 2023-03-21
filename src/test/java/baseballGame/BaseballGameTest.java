package baseballGame;

import baseballGame.controller.GameController;
import baseballGame.dto.BallAndStrike;
import baseballGame.service.BallService;
import baseballGame.service.GameService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BaseballGameTest {

    private static GameController gameController;

    @BeforeAll
    static void gameController() {

        gameController = new GameController();
    }

    @Test
    void createBallsTest() {

        List<Integer> computerBalls = gameController.createBalls();
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

