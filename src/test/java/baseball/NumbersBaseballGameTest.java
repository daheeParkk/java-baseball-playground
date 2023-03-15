package baseball;

import game.NumbersBaseballGame;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class NumbersBaseballGameTest {

    @Test
    public void generateRandomNumbersTest() {

        NumbersBaseballGame numbersBaseballGame = new NumbersBaseballGame();
        ArrayList<Integer> randomNumbers = numbersBaseballGame.generateRandomNumbers();
        assertThat(randomNumbers).doesNotContain(0);
        assertThat(randomNumbers.size()).isEqualTo(3);
    }

    @Test
    public void compareNumbersTest() {

        NumbersBaseballGame numbersBaseballGame = new NumbersBaseballGame();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(3);
        int[] strikeAndBall = numbersBaseballGame.compareNumbers("253", randomNumbers);
        assertThat(strikeAndBall).containsOnly(1,1);
    }
}
