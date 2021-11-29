package dynamictypes.publictransport;

import dynamictypes.Bus;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void PublicTransportTest() {
        Bus bus1 = new Bus(12, 25, "Volvo");
        PublicVehicle bus2 = new Bus(8, 13, "Ikarus");
        PublicVehicle tram1 = new Tram(4, 32, 3);
        PublicVehicle metro = new Metro(2, 50, 12);
        List<PublicVehicle> publicVehicleList = new ArrayList<>();
        PublicTransport publicTransport = new PublicTransport(publicVehicleList);
        //publicTransport.addVehicle(bus1);
        publicTransport.addVehicle(bus2);
        publicTransport.addVehicle(tram1);
        publicTransport.addVehicle(metro);
        assertEquals(3, publicTransport.getPublicVehicle().size());
        assertEquals(4, publicTransport.getPublicVehicle().get(1).getLineNumber());
    }
}