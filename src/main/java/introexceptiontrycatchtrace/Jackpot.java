package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        winner.addNames("Feri");
        winner.addNames(null);
        winner.addNames("Laci");

        try {
            String winnerName = winner.getWinner();
            System.out.println(winnerName);
        } catch (NullPointerException npe) {
            System.out.println("Not a name!");
        }
    }
}



