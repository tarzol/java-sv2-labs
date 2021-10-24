package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        for ( String student : students ) {
            if ( student.length() <=10) {
                System.out.println("1.csoprt (név hossza < 10betű: "+student);
            } else {
                System.out.println("2.csoprt (név hosza > 10betű: "+student);
            }
        }

        return ;
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Cser Imre", "Tarcsai Zoltán", "Horváth József", "Kis Piros", "Hosszúnevű János");
        StudyGroup studyPerson = new StudyGroup();

        studyPerson.printStudyGroups(students);
    }
}
