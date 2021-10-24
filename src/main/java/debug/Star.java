package debug;

public class Star {
    public void writeStars(int[] numbers) {
        printStars(numbers[0]);
        System.out.println();
        for (int i = 1; i < numbers.length; i++) {
            //int prev = 0;
            int stars = numbers[i] - numbers[i-1];
            printStars(stars);
            //prev = numbers[i];
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        int[] numbers = {2, 4, 7, 9};
        star.writeStars(numbers);
    }
}
