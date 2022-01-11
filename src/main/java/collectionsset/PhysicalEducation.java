package collectionsset;

import java.util.*;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student actual : students) {
            heights.add(actual.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation education = new PhysicalEducation();
        List<Student> students = new ArrayList<>(Arrays.asList(new Student("Peti", 188),
                new Student("Laci", 179), new Student("Kati", 168),
        new Student("Tibi", 159), new Student("Judit", 169)));
        System.out.println(education.getOrderInLessons(students));
    }
}
