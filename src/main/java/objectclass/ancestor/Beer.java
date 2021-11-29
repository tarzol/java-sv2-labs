package objectclass.ancestor;

public class Beer {

    String name;
    int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object o) {
        return true;
    }
}
