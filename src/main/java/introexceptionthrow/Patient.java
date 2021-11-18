package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        if ( name == "") {
            throw new IllegalArgumentException("Nem adott meg nevet!");
        }
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        if ( yearOfBirth < 1900) {
            throw new IllegalArgumentException("A megadott születési évszám nem megfelelő! -"+yearOfBirth);
        }
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Zoli", "123456", 1961);
        Patient patient2 = new Patient("Old", "123456", 1861);
        Patient patient3 = new Patient("", "123456", 1961);
        Patient patient4 = new Patient("", "123456", 1861);

        try {
            System.out.println("Patient1 "+patient1.getName()+"  "+ patient1.getSocialSecurityNumber()+" "+patient1.getYearOfBirth() );
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }

        try {
            System.out.println("Patient2 "+patient2.getName()+"  "+ patient2.getSocialSecurityNumber()+" "+patient2.getYearOfBirth() );
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }

        try {
            System.out.println("Patient3 "+patient3.getName()+"  "+ patient3.getSocialSecurityNumber()+" "+patient3.getYearOfBirth() );
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }

        try {
            System.out.println("Patient4 "+patient4.getName()+"  "+ patient4.getSocialSecurityNumber()+" "+patient4.getYearOfBirth() );
        } catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }
    }
}
