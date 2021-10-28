package conversions;

public class TooBigNumber {
    public long getRightResult(int number) {
        long rightResult = (long) number + 2_147_483_647;
        return rightResult;
    }

    public static void main(String[] args) {
        TooBigNumber tooBig = new TooBigNumber();
        long number = tooBig.getRightResult(13);
        System.out.println(number);
    }
}
