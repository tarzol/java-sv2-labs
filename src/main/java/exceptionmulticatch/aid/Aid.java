package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;
    public static final int AID_PER_SETTLEMENT = 1_489_600;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String actual : lines ) {
                String[] tmp = actual.split(" ");
                result.add(tmp[0]+" "+AID_PER_SETTLEMENT/Integer.parseInt(tmp[1]) );
            }
        } catch(NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
        return result;
    }

    public int getAmount() {
        return amount;
    }
}
