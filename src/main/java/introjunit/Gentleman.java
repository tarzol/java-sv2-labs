package introjunit;

public class Gentleman {
    public String sayHello(String name) {
        String str = "";
        if (name == null) {
            str = "Hello Anonymus";
        } else {
            str = "Hello ".concat(name);
        }
        return str;
    }

    public Gentleman() {
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        System.out.println(gentleman.sayHello("John "));
    }
}
