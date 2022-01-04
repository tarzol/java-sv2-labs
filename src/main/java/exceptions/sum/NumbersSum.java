package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if ( numbers == null ) {
            throw new IllegalArgumentException("The value of array is null!");
        }
        int sum = sum(numbers);
        return sum;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("The value of array is null!");
        }
        try {
            int sum = 0;
            for (String item : numbers) {
                sum += Integer.parseInt(item);
            }
            return sum;
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("There is an element that cannot be converted to number!");
        }
    }


    private int sum (int[] numbers) {
        int sum = 0;
        for ( int i= 0; i < numbers.length; i++ )
            sum += numbers[i];
        return sum;
    }

    public static void main(String[] args) {
        NumbersSum nums = new NumbersSum();
        //nums.getSum(null)
        nums.getSum(new int[]{ 1, 2, 3, 4 });
        nums.getSum(new String[]{"1", "2", "A"});
    }
}
