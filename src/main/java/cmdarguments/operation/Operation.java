package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for ( String input: args ) {
            System.out.println(input);
            if (input.equals("list")) {
                System.out.println(input+" Listázás");
            } else if (input.equals("add")) {
                System.out.println(input+" Hozzáadás");
            } else if (input.equals("delete")) {
                System.out.println(input+" Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
            System.out.println();
        }

        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }

        /*String[] fruits = {"apple", "peach", "plum", "orange"};
        for ( String fruit: fruits ) {
            System.out.println(fruit);
        }*/
    }
}
