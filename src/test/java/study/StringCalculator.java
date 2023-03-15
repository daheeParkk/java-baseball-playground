package study;

import java.io.InputStream;
import java.util.Scanner;

//오류남
public class StringCalculator {

    public int calculator(InputStream in) {

        int result;

        Scanner scanner = new Scanner(in);

        String value = scanner.nextLine();
        String[] values = value.split(" ");

        result = Integer.parseInt(values[0]);

        return calculate(values, 1, result);
    }

    private int calculate(String[] values, int index, int result) {

        if (index < values.length) {

            if (values[index].equals("+")) {
                index++;
                result += Integer.parseInt(values[index]);
            } else if (values[index].equals("-")) {
                index++;
                result -= Integer.parseInt(values[index]);
            } else if (values[index].equals("*")) {
                index++;
                result *= Integer.parseInt(values[index]);
            } else if (values[index].equals("/")) {
                index++;
                result /= Integer.parseInt(values[index]);
            }
            index++;
            calculate(values, index, result);
        }

        return result;
    }
}

