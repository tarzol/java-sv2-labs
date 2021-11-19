package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Paths.*;

public class RoadMap {

    public static void main(String[] args) {

        List<String> villages = Arrays.asList("Telki", "Páty", "Biatorbágy");
        try {
            Files.write(Paths.get("villages.txt"), villages);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("You cannot write.");
        }
    }

}
