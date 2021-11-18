package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        Adult person1 = new Adult("Zoli", 30);
        Adult person2 = new Adult("Petike", 7);
        Adult person3 = new Adult("Katika", 17);

        try {
            System.out.println(person1.getName()+"életkora: "+ person1.getAge());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        try {
            System.out.println(person2.getName()+"életkora: "+ person2.getAge());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        try {
            System.out.println(person3.getName()+"életkora: "+ person3.getAge());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
