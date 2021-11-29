package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school1 = new School("Zoli", 12);
        School school2 = new PrimarySchool("Zoli primary", 8);
        School school3 = new SecondarySchool("Zoli secondary", 4);

        System.out.println("Teljes iskola: "+school1.getName()+" évek: "+school1.getNumberOfYears());
        System.out.println((school1.toString()));
        System.out.println(school2.toString());
        System.out.println("Általános: "+school2.getName()+" évek: "+school2.getNumberOfYears());
        System.out.println(school3.toString());
        System.out.println("középsuli:"+school3.getName()+" évek: "+school3.getNumberOfYears());
    }
}
