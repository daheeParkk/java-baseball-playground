package baseballGame;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.NotOneTwo;
import baseballGame.exception.WrongLength;
import baseballGame.service.InputService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static baseballGame.ui.Result.*;
import static org.assertj.core.api.Assertions.*;

public class ExceptionTest {

    private static InputService inputService;

    @BeforeAll
    static void inputService() {

        inputService = new InputService();
    }

    @DisplayName("3글자가 아닐 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = "1234")
    public void wrongLengthTest(String inputBalls) {

        assertThatThrownBy(() -> {
            inputService.checkCollect(inputBalls);
        }).isInstanceOf(WrongLength.class).hasMessage(WRONG_LENGTH.getMessage());
    }

    @DisplayName("숫자가 아닐 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = "abc")
    public void notNumberTest(String inputBalls) {

        assertThatThrownBy(() -> {
            inputService.checkCollect(inputBalls);
        }).isInstanceOf(NotNumber.class).hasMessage(NOT_NUMBER.getMessage());
    }

    @DisplayName("중복된 숫자일 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = "111")
    public void duplicateNumberTest(String inputBalls) {

        assertThatThrownBy(() -> {
            inputService.checkCollect(inputBalls);
        }).isInstanceOf(DuplicateNumber.class).hasMessage(DUPLICATE_NUMBER.getMessage());
    }

    @DisplayName("1이나 2가 아닐 경우 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = "3")
    public void checkOneTwoTest(String inputBalls) {

        assertThatThrownBy(() -> {
            inputService.checkOneTwo(inputBalls);
        }).isInstanceOf(NotOneTwo.class).hasMessage(NOT_ONE_TWO.getMessage());
    }
}
