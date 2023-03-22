package baseballGame;

import baseballGame.dto.BallAndStrike;
import baseballGame.service.BallService;
import baseballGame.service.GameService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallTest {

    private static BallService ballService;
    private static GameService gameService;

    @BeforeAll
    static void gameController() {

        ballService = new BallService();
        gameService = new GameService();

    }

    @DisplayName("숫자 개수 테스트")
    @Test
    void createBallsTest() {

        List<Integer> computerBalls = ballService.createBalls();
        assertThat(computerBalls.size()).isEqualTo(3);
    }

    @DisplayName("3스트라이크, 2볼1스트라이크, 낫싱 테스트")
    @ParameterizedTest
    @CsvSource(value = {"123:03","132:21","567:00"}, delimiter = ':')
    void compareBallsTest(String myBalls, String result) {

        List<Integer> computerBalls = Arrays.asList(1, 2, 3);
        BallAndStrike ballAndStrike = gameService.compareBalls(computerBalls, myBalls);

        int ballNum = Integer.parseInt(String.valueOf(result.charAt(0)));
        int strikeNum = Integer.parseInt(String.valueOf(result.charAt(1)));

        assertThat(ballAndStrike.getBallAndStrike().get(0)).isEqualTo(ballNum);
        assertThat(ballAndStrike.getBallAndStrike().get(1)).isEqualTo(strikeNum);
    }
}

