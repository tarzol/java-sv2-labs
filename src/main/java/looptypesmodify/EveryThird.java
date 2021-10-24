package looptypesmodify;

public class EveryThird {
    public void changeToZero(int[] numbers) {
        int index = 0;
        for ( int i=numbers.length-1; i>=0; i-- ) {
            if (index %3 == 0) {
                numbers[i] = 0;
            }
            System.out.print(numbers[i]+"  ");
            index +=1;
        }
    }

    public static void main(String[] args) {
        EveryThird everythird = new EveryThird();
        int[] array = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        everythird.changeToZero(array);
    }
}
