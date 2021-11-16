package stringbasic;

public class Student {
    Person person;
    String neptunCode;
    String studyNo;
    String entyCardNo;

    public Student(Person person, String neptunCode, String studyNo) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.studyNo = studyNo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getStudyNo() {
        return studyNo;
    }

    public void setStudyNo(String studyNo) {
        this.studyNo = studyNo;
    }

    public String getEntyCardNo() {
        return entyCardNo;
    }

    public void setEntyCardNo(String entyCardNo) {
        this.entyCardNo = entyCardNo;
    }
}
