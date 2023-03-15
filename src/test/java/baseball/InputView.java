package baseball;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public int InputNumber() {

        System.out.println("숫자를 입력해 주세요 : ");
        return Integer.parseInt(scanner.nextLine());
    }
}
