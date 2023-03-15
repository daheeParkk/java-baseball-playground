package study;

import java.io.InputStream;
import java.util.Scanner;

public class StringCalculator2 {

    public int calculator(InputStream in) {

        int result;
        int index = 1;

        Scanner scanner = new Scanner(in);

        String value = scanner.nextLine();
        String[] values = value.split(" ");

        result = Integer.parseInt(values[0]);

        while (index < values.length) {
            result = calculate(values, index, result);
            index += 2;
        }

        return result;
    }

    private int calculate(String[] values, int index, int result) {

        switch (values[index]) {
            case "+":
                result += Integer.parseInt(values[index+1]);
                break;
            case "-":
                result -= Integer.parseInt(values[index+1]);
                break;
            case "*":
                result *= Integer.parseInt(values[index+1]);
                break;
            case "/":
                result /= Integer.parseInt(values[index+1]);
                break;
        }
        return result;
    }
}
