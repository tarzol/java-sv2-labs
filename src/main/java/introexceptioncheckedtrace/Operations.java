package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Operations {

   public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("underground.txt"));
    }

    public String getDailySchedule(List<String> carriages) {
       StringBuilder result = new StringBuilder();
       for ( String number : carriages ) {
           //System.out.println(number);
           if (number.charAt(0) == '2') {
               result.append(number);
               result.append("  ");
           }
       }
       String message = result.toString();
       return message;
    }

}
