package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        String text = "1"+"2";
        System.out.println(text);

        double quotient = 3/4d;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word;
        word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
