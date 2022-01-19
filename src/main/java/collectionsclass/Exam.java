package collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exam {

    List<ExamResult> exams = new LinkedList<>();

    public Exam(List<ExamResult> exams) {
        this.exams = exams;
    }


    public List<ExamResult> getExams() {
        return exams;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < places; i++) {
            result.add(exams.get(i).getName());
        }
        return result;
    }

    public static void main(String[] args) {
        ExamResult exam1 = new ExamResult("Zoli", 12);
        Exam exam = new Exam(Arrays.asList(exam1, new ExamResult("Peti", 15), new ExamResult("Kati", 19)));

        List<String> succeededPeople = exam.getNamesOfSucceededPeople(2);
        System.out.println(succeededPeople);
    }
}
