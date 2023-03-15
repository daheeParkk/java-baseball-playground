package game;

public class ResultView {

    public String  returnResult(int[] strikeAndBall) {

        if (strikeAndBall[0]>0 && strikeAndBall[1]>0) {

            return "\n"+strikeAndBall[1]+"볼 "+strikeAndBall[0]+"스트라이크\n";
        }

        if (strikeAndBall[0]>0 && strikeAndBall[1] == 0) {

            return "\n"+strikeAndBall[0]+"스트라이크\n";
        }

        if (strikeAndBall[0] == 0 && strikeAndBall[1] > 0) {

            return "\n"+strikeAndBall[1]+"볼\n";
        }

        return "\n낫싱\n";
    }
}
