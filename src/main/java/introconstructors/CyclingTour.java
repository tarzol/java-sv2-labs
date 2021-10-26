package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() { return description; }

    public LocalDate getStartTime() { return startTime;}

    public int getNumberOfPeople() { return numberOfPeople;}

    public void registerPerson(int person) { numberOfPeople = numberOfPeople+person;   }

    public void ride(double km) {}
    public double getKms() { return kms; }

    public static void main(String[] args) {
        CyclingTour tour1 =new CyclingTour("Budapest-Balaton", LocalDate.now() );
        System.out.println("A túra leírása: "+tour1.getDescription());
        System.out.println("A túra ideje: "+tour1.getStartTime());
        System.out.println("Résztvevők: "+tour1.getNumberOfPeople());
        tour1.registerPerson(3);
        System.out.println("Résztvevők az újak után: "+tour1.getNumberOfPeople());
    }
}
