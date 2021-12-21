package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River {

    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }



    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {

        Water water = new Danube("Danube", 2200, Arrays.asList("Vienna","Bratislava", "Budapest" ));
        River river = new Danube("Danube", 2200, Arrays.asList("Vienna","Bratislava", "Budapest" ));
        Danube danube = new Danube("Danube", 2200, Arrays.asList("Vienna","Bratislava", "Budapest" ));

        System.out.println("Nincs használható metódus - üres.");
        System.out.println(river.getName()+"  "+river.getLength());
        System.out.println(danube.getName()+"  "+danube.getLength()+"    "+danube.getCapitals());
    }
}
