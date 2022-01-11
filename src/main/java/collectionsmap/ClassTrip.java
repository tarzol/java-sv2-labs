package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> tripItems = new HashMap<>();

    public Map<String, Integer> getTripItems() {
        return tripItems;
    }

    public void loadInpayments(Path path) {
        try {
            List<String> lines = new ArrayList<>();
            lines = Files.readAllLines(path);
            for (String actual : lines) {
                String[] tmp = actual.split(":");
                tripItems.put(tmp[0],Integer.parseInt(tmp[1].trim()));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }
    }

    public static void main(String[] args) {
        ClassTrip classTrip = new ClassTrip();
        classTrip.loadInpayments(Paths.get("src/main/resources/inpayments.txt"));
        System.out.println(classTrip.getTripItems().size());
    }
}
