package game;

import java.util.Scanner;

public class ResultView {

    public String  returnResult(int[] strikeAndBall) {

        if (strikeAndBall[0] == 3) {

            return collectAnswer(strikeAndBall);
        }

        if (strikeAndBall[0]>0 && strikeAndBall[1]>0) {

            System.out.print("\n"+strikeAndBall[1]+"볼 "+strikeAndBall[0]+"스트라이크\n");
        }

        if (strikeAndBall[0]>0 && strikeAndBall[1] == 0) {

            System.out.print("\n"+strikeAndBall[0]+"스트라이크\n");
        }

        if (strikeAndBall[0] == 0 && strikeAndBall[1] > 0) {

            System.out.print("\n"+strikeAndBall[1]+"볼\n");
        }

        if (strikeAndBall[0] == 0 && strikeAndBall[1] == 0) {

            System.out.print("\n낫싱\n");
        }

        return "0";
    }

    private String collectAnswer(int[] strikeAndBall) {

        System.out.println("\n3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");

        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("1")) {
            return "1";
        }
        return "2";

    }
}
