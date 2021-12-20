package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("A file nem elérhető", ioe);
        }
        return lines;
    }

    public static void main(String[] args) {
        Bill bill = new Bill();
        List<String> result = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));
        System.out.println(result.get(0).toString());
    }
}
