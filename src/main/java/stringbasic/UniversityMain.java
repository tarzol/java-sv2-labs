package stringbasic;

import java.util.List;

public class UniversityMain {
    public static void main(String[] args) {
        //Person person1 = new Person("Tarcsai","tarcsai.z@gmail.com","024","1234", "36301234");
        Student student1 = new Student(new Person("Tarcsai","tarcsai.z@gmail.com","024","1234", "36301234"), "A1B2C3", "9876543210");
        Person person2 = new Person("Kovács", "kovacs.e@gmail.com", "048", "5678", "36305678");
        Student student2 = new Student(person2, "A1B2C3", "9876543210");

        University university = new University();

        //System.out.println(person1.getName()+"  "+person1.getEmail()+" "+person1.getBankAccountNo());
        //System.out.println(person2.getName()+"  "+person2.getEmail()+" "+person2.getBankAccountNo());
        System.out.println(student1.getPerson().getName());

        //System.out.println(person1.);
    }
}

    /*public static void main(String[] args) {
        Person person = new Person("Kovács Péter", "kovacsp@gmail.com", "123456789",
                "12345678-87654321-12345678", "+3620-1234567");
        Student student = new Student(person, "A1B2C3", "9876543210");
        University university = new University();

        Person samePerson = new Person("Peter Schmidt", "pschmidt@gmail.com", "1010101010",
                "12345678-87654321-00000000", "+43-681-12345678");
        Student sameStudent = new Student(samePerson, "A1B2C3", "9876543210");

        Person anotherPerson = new Person("Kovács Péter", "kovacsp@gmail.com", "123456788",
                "12345678-87654321-12345678", "+3620-1234567");
        Student anotherStudent = new Student(anotherPerson, "D4E5F6", "0123456789");

        student.setCardNumber("CB-0123");
        System.out.println(student.getCardNumber());
        System.out.println(university.areEqual(student, sameStudent));
        System.out.println(university.areEqual(student, anotherStudent));

        List<Student> studentsWithNoStudents = university.getStudents();
        System.out.println(studentsWithNoStudents.size());
        university.addStudent(student);
        List<Student> studentsWithOneStudent = university.getStudents();
        System.out.println(studentsWithOneStudent.size());
    }*/
