package cmdarguments.verse;

public class VerseMain {

    public static void main(String[] args) {
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }

        for (int i=1; i<args.length+1; i++) {
            System.out.print(args[args.length-i]+" ");
        }
    }
}
