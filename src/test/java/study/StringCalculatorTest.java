package study;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void calculatorTest() {

        StringCalculator2 stringCalculator = new StringCalculator2();
        InputStream sysInBackup = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("2 + 3 * 4 / 2".getBytes());
        System.setIn(in);

        assertThat(stringCalculator.calculator(in)).isEqualTo(10);

        System.setIn(sysInBackup);
    }
}
