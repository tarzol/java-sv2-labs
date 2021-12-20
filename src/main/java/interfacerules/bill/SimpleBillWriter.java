package interfacerules.bill;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {

        StringBuilder sb = new StringBuilder();
        for(String item: billItems) {
            String[] tmp = item.split(";");
            sb.append(tmp[0]+", "+tmp[2]+" * "+tmp[1]+" ="
                    + Integer.parseInt(tmp[1])*Integer.parseInt(tmp[2])+" Ft");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SimpleBillWriter simpleBillWriter = new SimpleBillWriter();
        Bill bill = new Bill();
        List<String> result = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));

        simpleBillWriter.writeBill(result);
    }
}

