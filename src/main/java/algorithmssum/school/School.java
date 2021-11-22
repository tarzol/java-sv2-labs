package algorithmssum.school;

import java.util.Arrays;
import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts) {
        int sum=0;
        for (Integer number : headcounts) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 3, 5, 7);
        School school = new School();
        System.out.println("Összesen: "+school.getNumberOfStudents(number));


    }
}
