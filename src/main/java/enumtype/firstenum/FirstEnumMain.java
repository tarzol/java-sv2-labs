package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {

        System.out.println(Continent.EUROPE);
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.AMERICA);
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("ATLANTI"));
        System.out.println(Ocean.valueOf("CSENDES"));
        System.out.println(Ocean.valueOf("INDIAI"));

        System.out.println(Football.KAPUS.name());
        System.out.println(Football.HÁTVÉD.name());
        System.out.println(Football.CSATÁR.name());
    }
}
