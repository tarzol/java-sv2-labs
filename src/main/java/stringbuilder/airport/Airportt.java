package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airportt {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok: ");
        for (Flight f : flights) {
            if (f.getStatus() == Status.DELETED) {
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Airportt airport = new Airportt();
        Flight flightToLA = new Flight("WIZ234", Status.ACTIVE );
        Flight flightToBud = new Flight("KLM567", Status.DELETED);
        Flight flightToParis = new Flight("AF235", Status.DELETED);
        airport.addFlight(flightToLA);
        airport.addFlight(flightToBud);
        airport.addFlight(flightToParis);
        System.out.println(airport.getDeletedFlights());

        /*Flight flightToBombay = new Flight("B-2351", Status.DELETED);
        Flight flightToParisss = new Flight("P-626783", Status.ACTIVE);
        Flight flightToFrankfurt = new Flight("F-24671", Status.ACTIVE);
        Flight flightToNewYork = new Flight("N-312561", Status.DELETED);
        Flight flightToSydney = new Flight("S-35", Status.DELETED);

        airport.addFlight(flightToBombay);
        airport.addFlight(flightToParis);
        airport.addFlight(flightToFrankfurt);
        airport.addFlight(flightToNewYork);
        airport.addFlight(flightToSydney);

        String deletedFlights = airport.getDeletedFlights();*/

        //System.out.println(deletedFlights);
    }
}
