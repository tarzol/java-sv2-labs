package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers = new ArrayList<>(Arrays.asList(new RightAnswer("Zoli"),
            new RightAnswer("Peti"), new RightAnswer("Zoli"),
            new RightAnswer("Kati"), new RightAnswer("Tibi")));

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        int count = 0;
        int tempWinner;
        Random rnd = new Random();
        while (count < 3) {
            if ( rightAnswers.isEmpty()) {
                throw new IllegalArgumentException("Túl kevés megfejtés érkezett");
            }
            tempWinner = rnd.nextInt( rightAnswers.size());
            if ( !winners.contains(rightAnswers.get(tempWinner).getName())) {
                winners.add(rightAnswers.get(tempWinner).getName());
                rightAnswers.remove(tempWinner);
                count++;
            }
        }
        return winners;
    }

    public static void main(String[] args) {
        QuestionGame game = new QuestionGame();
        System.out.println(game.drawWinners());
    }
}
