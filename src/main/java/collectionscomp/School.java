package collectionscomp;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class School {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>(new StudentComparator());
        Student firstStudent = new Student("Úttörő Lajos", 135);
        Student secondStudent = new Student("Kiss József", 122);
        Student thirdStudent = new Student("Molnár Irén", 144);
        Student fourthStudent = new Student("Álmos Árpád", 118);
        Student fifthStudent = new Student("Illyés Borbála", 138);
        Student sixthStudent = new Student("Órás Eleonóra", 160);
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);
        students.add(sixthStudent);
        System.out.println(students);
        System.out.println();

        Map<String, Integer> mapStudents = new TreeMap<>(Collator.getInstance(new Locale("hu","HU")));
        mapStudents.put(firstStudent.getName(), firstStudent.getHeight());
        mapStudents.put(secondStudent.getName(), secondStudent.getHeight());
        mapStudents.put(thirdStudent.getName(), thirdStudent.getHeight());
        mapStudents.put(fourthStudent.getName(), fourthStudent.getHeight());
        mapStudents.put(fifthStudent.getName(), fifthStudent.getHeight());
        mapStudents.put(sixthStudent.getName(), sixthStudent.getHeight());

        System.out.println(mapStudents);
    }
}
