package methodpass;

public class One {

    public int addOne(int number) {
        return number = number+1;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Itt 5 az érték: "+number);

        number +=1;
        System.out.println("It várhatóan 6: "+number);

        One one = new One();
        System.out.println("Átadott érték - 6, plusz 1: "+one.addOne(number));
        System.out.println("number változó értéke: "+number);
    }
}
