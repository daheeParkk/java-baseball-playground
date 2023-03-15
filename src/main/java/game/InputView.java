package game;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String inputNumber() {

        System.out.println("숫자를 입력해 주세요 : ");
        return scanner.nextLine();
    }

}
