package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @Test
    void replace() {

        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void StringClassTest1() {

        String[] arr1 = "1,2".split(",");
        String[] arr2 = "1".split(",");
        assertThat(arr1).containsExactly("1", "2");
        assertThat(arr2).containsExactly("1");
    }

    @Test
    void StringClassTest2() {

        String num = "(1,2)".substring(1, 4);
        assertThat(num).isEqualTo("1,2");
    }

    @Test
    void StringClassTest3() {

        assertThatThrownBy(() -> {

            char c = "abc".charAt(4);
            assertThat(c).isEqualTo('a');

        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
