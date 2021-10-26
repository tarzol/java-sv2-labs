package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task feladat = new Task("Tanulás", "Meg kell tanulni a leckét");
        System.out.println("Feladat elnevezése: "+feladat.getTitle());
        System.out.println("Feladat leírása: "+feladat.getDescription());

        feladat.setDuration(6);
        feladat.start();
        System.out.println(("A feladat időtartama: "+feladat.getDuration()));
        System.out.println(("A feladat kezdete: "+feladat.getStartDateTime()));
    }
}
