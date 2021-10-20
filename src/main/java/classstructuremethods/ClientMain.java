package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Joe Black");
        System.out.println("Ügyfél neve:  "+client.getName());

        client.setYear(1999);
        System.out.println("Születési ideje:  "+client.getYear());

        client.setAddress("Budapest");
        System.out.println("Lakhelye:  "+client.getAddress());

        client.migrate("Csorna");
        System.out.println("Új lakhelye:  "+client.getAddress());
    }
}
