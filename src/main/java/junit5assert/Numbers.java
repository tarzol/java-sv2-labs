package junit5assert;

public class Numbers {

    public int[] getEvenNumbers(int[] numbers) {
        for ( int i= 0; i < numbers.length; i++ ) {
            if (i%2 != 0) {
                numbers[i] = 0;
            }
            System.out.print(numbers[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = numbers.getEvenNumbers(nums);
        System.out.println(nums2);
    }


}
