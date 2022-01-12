package collectionscomp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.valueOf(student1.getHeight()).compareTo(student2.getHeight());
    }
}
