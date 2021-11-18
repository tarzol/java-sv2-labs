package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        try {
            List<String> persons =new Neptun().readPersons();
            System.out.println(persons);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public List<String> readPersons() throws IOException {
        List<String> allData = new ArrayList<>();
        List<String> neptunCodes = new ArrayList<>();
        allData = Files.readAllLines(Paths.get("neptun.csv"));
        for (String line: allData) {
            int comma = line.indexOf(",");
            neptunCodes.add(line.substring(comma+1));
        }
        return neptunCodes;
    }
}
