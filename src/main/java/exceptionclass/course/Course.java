package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        this.name = name;
        this.begin = begin;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    public void setBegin(SimpleTime begin) {
        this.begin = begin;
    }
}
