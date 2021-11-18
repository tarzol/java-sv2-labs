package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {
    public static void main(String[] args) {
        List<String> carriages = new ArrayList<>();

        try {
            carriages = new Operations().readFile();
            System.out.println(carriages);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Operations operations = new Operations();
        System.out.println("\n"+operations.getDailySchedule(carriages));
    }
}

