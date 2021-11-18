package introexceptionreadfile;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holyday {
    public static void main(String[] args) {
        try {
            List<String> items = Files.readAllLines(Paths.get("holiday.txt"));
            System.out.println(items);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
