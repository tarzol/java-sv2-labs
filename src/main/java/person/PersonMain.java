package person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("John Doe", "AB1234");
        Address address = new Address("Magyarország", "Budajenő", "Ady E u ", "H-2093");

        person.setAddress(address);
        System.out.println("A cím: "+person.getAddress().getCity());
        System.out.println();
        System.out.println();

        System.out.println(person.getName()+"   "+person.getIdentificationCard()+ "  "+person.personToString());

        System.out.println("Címek: "+person.getAddress().addressToString());
        System.out.println("irányítószám: "+person.getAddress().getZipCode());
    }
}
