package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Marriage {

    public void getMarried(Woman woman, Man man) {

        man.addRegisterDates(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        woman.addRegisterDates(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }

    public static void main(String[] args) {
        Marriage marriage = new Marriage();
        List<RegisterDate> LajosLista = new ArrayList<>();
        List<RegisterDate> KataLista = new ArrayList<>();

        marriage.getMarried(new Woman("Kata", KataLista), new Man("Lajos", LajosLista));
        marriage.getMarried(new Woman("Kata", KataLista), new Man("Lajos", LajosLista));
        System.out.println("Lajos bejegyzései: "+LajosLista.size());
        System.out.println("Kata bejegyzései: "+KataLista.size());
        marriage.getMarried(new Woman("Kata", KataLista), new Man("Lajos", LajosLista));
        System.out.println("Lajos bejegyzései: "+LajosLista.size());
    }
}
