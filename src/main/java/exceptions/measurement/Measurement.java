package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> lines = new ArrayList<>();
        List<String> faultyLines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
            faultyLines = checkingContentOfLines(lines);

        } catch (IOException e) {
            throw new IllegalStateException("File cannot be read!", e);
        }
        return faultyLines;
    }

    private List<String> checkingContentOfLines(List<String> lines) {
        List<String> faultyLines = new ArrayList<>();
        for (String item: lines) {
            if (!isFaultyLine(item)) {
                faultyLines.add(item);
                //System.out.println(item.toString());
            }
        }
        return faultyLines;
    }

    private boolean isFaultyLine(String line) {
        String[] tmp = line.split(",");
        try {
            return isLineNumberCorrect(tmp[0]) &&
                    isMeasuredValueCorrect(tmp[1]) &&
                    isNameCorrect(tmp[2]);

        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    private boolean isLineNumberCorrect(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isMeasuredValueCorrect(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isNameCorrect(String name) {
        String[] nameElements = name.split(" ");
        if ( nameElements.length > 1 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Measurement meas = new Measurement();
        List<String> faultyLines = meas.readFromFile(Paths.get("src/main/resources/measurementdata.csv"));
        System.out.println(faultyLines.get(1).toString());
        System.out.println(faultyLines.size());
    }
}
