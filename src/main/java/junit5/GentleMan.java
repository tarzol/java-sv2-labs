package junit5;

public class GentleMan {
    public String sayHello(String name) {
        if (name.equals(null)) {
            return "Hello Anonymus";
        }
        return "Hello "+name;
    }
}
