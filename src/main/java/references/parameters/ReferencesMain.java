package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person = new Person("Zoli", 60);
        person1 = person;
        person2 = person1;
        person2.setName("nem Zoli");
        System.out.println("person1 név: "+person1.getName());
        System.out.println("person2 név: "+person2.getName());

        int number1 = 24;
        int number2 = number1;
        number2 += 1;
        System.out.println("number 1 és number 2: "+number1+"  "+number2);

        Person person3 = new Person("Anna", 21);
        person1 = person3;
        System.out.println("person1 és person3 nevek:" +person1.getName()+"  "+person3.getName());
    }
}
