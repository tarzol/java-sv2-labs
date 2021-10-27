package person;

public class Person {
    String name;
    String identificationCard;
    private Address address;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String personToString() {
        return name+identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void correctData() {

    }

}

