package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        String studentNeptunCode = student.getNeptunCode();
        String anotherStudentNeptunCode = student.getNeptunCode();
        //String studentEducationalId = student.getEducationalId();
        //String anotherStudentEducationalId = anotherStudent.getEducationalId();

        return studentNeptunCode.equals(anotherStudentNeptunCode);
                /*&& studentEducationalId.equals(anotherStudentEducationalId);*/
    }
}
    /*public void addStudent(Student student) {
        //student.setPerson("Tarcsai");
    }*/

    //public void addS


    /*public boolean areEqual(Student student, Student anotherStudent) {
        boolean areEqual = false;
        if (student.getEntyCardNo() == anotherStudent.getEntyCardNo()) {
            areEqual =true;
        }
        return areEqual;
    }*/

