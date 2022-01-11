package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<String> addresses = new ArrayList<>();

    public void addAddress(String address) {
        addresses.add(address);
    }

    public void removeAddress(String address) {
        addresses.remove(addresses.indexOf(address));
    }

    public void removeLastAddress(String address) {
        addresses.remove(addresses.lastIndexOf(address));
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public static void main(String[] args) {
        Postman postman = new Postman();
        postman.addAddress("Budapest");
        postman.addAddress("Budajenő");
        postman.addAddress("Csorna");
        postman.addAddress("Budapest");
        postman.addAddress("Pécs");
        postman.addAddress("Budapest");
        postman.addAddress("Pécs");
        System.out.println(postman.getAddresses());
        postman.removeAddress("Budapest");
        System.out.println(postman.getAddresses());
        postman.removeLastAddress("Pécs");
        System.out.println(postman.getAddresses());
    }
}
