package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(5.6,true);
        int intKm = (int) distance.getDistanceKm();
        System.out.println("Távolság(egész km): "+intKm);
        System.out.println("Távolság rendben? "+distance.isExact());
    }

}
