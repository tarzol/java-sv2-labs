package interfacerules.bill;

import java.nio.file.Paths;
import java.util.List;

public class ComplexBillWriter implements BillWriter{

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for(String item: billItems) {
            String[] tmp = item.split(";");
            sb.append(tmp[0]+"; darabszám: "+tmp[2]+" Egységár: "+tmp[1]+", összesen: "
                    + Integer.parseInt(tmp[1])*Integer.parseInt(tmp[2])+" Ft");

        }
        return sb.toString();
    }
    public static void main(String[] args) {

        ComplexBillWriter complexBillWriter = new ComplexBillWriter();
        Bill bill = new Bill();
        List<String> result = bill.readBillItemsFromFile(Paths.get("src/test/resources/billitems.txt"));

        complexBillWriter.writeBill(result);
    }
}

