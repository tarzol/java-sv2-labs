package mathproblems;

public class Division {
    public void getDivisors(int number) {
        for ( int i = 1; i<number; i++) {
            if ( number%i == 0){
                System.out.println("12 osztója: "+i);
            }
        }
    }

    public static void main(String[] args) {
        Division div = new Division();

        div.getDivisors(12);

        int numbers[] = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        div.getRightNumbers(numbers);
    }

    public void getRightNumbers(int[] numbers) {
        for ( int i = 1; i<numbers.length; i++) {
            if ( numbers[i] % i == 0){
                System.out.println("Osztható tömbelemek: "+numbers[i]);
            }
        }
    }
}
