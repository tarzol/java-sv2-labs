package methodoverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> names = Arrays.asList("Kovács Péter", "Németh Piroska", "Horváth László", "Varga Hedvig", "CserImre");

    public String getTodayReferringStudent(int number) {
        return names.get(number-1);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getValue()-1);
    }

    public String getTodayReferringStudent(String numberName) {
        System.out.println("Nagybetűsítés"+numberName.toUpperCase());
        System.out.println("valueOf"+Number.valueOf(numberName.toUpperCase()));
        System.out.println("getValue"+Number.valueOf(numberName.toUpperCase()).getValue());
        return names.get(Number.valueOf(numberName.toUpperCase()).getValue()-1);
    }
}
