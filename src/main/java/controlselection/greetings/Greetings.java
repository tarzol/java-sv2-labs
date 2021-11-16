package controlselection.greetings;

import java.time.LocalDate;
import java.time.LocalTime;

public class Greetings {

    public String greet(int hour, int minutes) {
       if ( hour < 5) {
           return "jó éjszakát";
       } else if ( hour >= 5 && hour < 9) {
            return "jó reggelt";
        } else if ( hour < 18 && minutes < 31) {
            return "jó napot";
        } else if ( hour < 20) {
            return "jó estét";
        } else {
            return "jó éjt";
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greet(5, 12));
        System.out.println(greetings.greet(9, 12));
        System.out.println(greetings.greet(19, 12));
        System.out.println(greetings.greet(21, 12));
        System.out.println(greetings.greet(4, 12));
    }
}
