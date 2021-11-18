package introexceptionthrow;

public class Adult {
    String name;
    int age;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        if (age < 18) {
            throw new IllegalArgumentException("A lekért személy kiskorú");
        }
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
