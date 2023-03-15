package baseball;

import game.NumbersBaseballGame;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NumbersBaseballGameTest {

    @Test
    public void generateRandomNumbersTest() {

        NumbersBaseballGame numbersBaseballGame = new NumbersBaseballGame();
        int[] randomNumbers = numbersBaseballGame.generateRandomNumbers();
        assertThat(randomNumbers).doesNotContain(0);
        assertThat(randomNumbers.length).isEqualTo(3);
    }
}
