package algorithmsdecision.towns;

import java.util.Arrays;
import java.util.List;

public class Town {

    public Boolean containsFewerHabitants(List<Integer> villages, int number) {
        for (Integer village : villages) {
            if (village < number) {
                System.out.println("A település lakossága: "+village);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> villages = Arrays.asList(4000,3000,2000,1000);
        int numberOfResidents =2500;
        Town town = new Town();
        if (town.containsFewerHabitants(villages, numberOfResidents)) {
            System.out.println("Van "+numberOfResidents+" főnél kisebb lakosú település.");
        } else {
            System.out.println("Nincs "+numberOfResidents+" főnél kisebb lakosú település.");
        }
    }
}
