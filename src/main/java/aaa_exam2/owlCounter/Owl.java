package aaa_exam2.owlCounter;

public class Owl {

    private String county;
    private int number;

    public Owl(String county, int numberOfQwls) {
        this.county = county;
        this.number = numberOfQwls;
    }

    public String getCounty() {
        return county;
    }

    public int getNumber() {
        return number;
    }
}
