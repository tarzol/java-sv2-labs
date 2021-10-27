package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a =2;
        System.out.println("a: "+a);
        Integer b = 2;
        System.out.println("b: "+b);
        Integer c = a;
        System.out.println("c: "+c);
        Integer d = b;
        System.out.println("d: "+d);
        Integer e = Integer.valueOf(2);
        System.out.println("e: "+e);
        int f = Integer.valueOf(2);
        System.out.println("f: "+f);
        int g = Integer.valueOf(a);
        System.out.println("g: "+g);
        int h = Integer.valueOf(c);
        System.out.println("h: "+h);
        int i = Integer.parseInt("2");
        System.out.println("i: "+i);
        Integer j =Integer.parseInt("2");
        System.out.println("j: "+j);

        boolean k = true;
        Boolean l = true;
        boolean m = Boolean.valueOf(true);
        Boolean n = Boolean.valueOf(true);
        boolean o = Boolean.parseBoolean("TrUe");
        Boolean p = Boolean.parseBoolean("TrUe");
        boolean q = Boolean.parseBoolean("TreU");
        Boolean r = Boolean.parseBoolean("TreU");

        System.out.println("k: "+k);
        System.out.println("l: "+l);
        System.out.println("m: "+m);
        System.out.println("n: "+n);
        System.out.println("o: "+o);
        System.out.println("p: "+p);
        System.out.println("q: "+q);
        System.out.println("r: "+r);
    }
}
