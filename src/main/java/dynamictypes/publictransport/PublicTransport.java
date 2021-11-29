package dynamictypes.publictransport;

import dynamictypes.Bus;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {
    List<PublicVehicle> publicVehicle = new ArrayList<>();

    public PublicTransport(List<PublicVehicle> publicVehicle) {
        this.publicVehicle = publicVehicle;
    }

    public List<PublicVehicle> getPublicVehicle() {
        return publicVehicle;
    }

    public void addVehicle(PublicVehicle vehicle) {
        publicVehicle.add(vehicle);
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus(12, 25, "Volvo");
        PublicVehicle bus2 = new Bus(8, 13, "Ikarus");
        PublicVehicle tram1 = new Tram(4, 32, 3);
        PublicVehicle metro = new Metro(2, 50, 12);
        List<PublicVehicle> publicVehicleList = new ArrayList<>();
        PublicTransport publicTransport = new PublicTransport(publicVehicleList);
        publicTransport.addVehicle(bus1);
        publicTransport.addVehicle(bus2);
        publicTransport.addVehicle(tram1);
        publicTransport.addVehicle(metro);
        System.out.println("A lista elemszáma: "+publicTransport.getPublicVehicle().size());
        System.out.println("Elemek: "+publicTransport.getPublicVehicle().get(1).getLineNumber()+"brand: "+publicTransport.getPublicVehicle().get(1).getLength());
        System.out.println("Elemek: "+publicTransport.getPublicVehicle().get(3).getLineNumber());
    }
}
