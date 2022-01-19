package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remainder {

   public void changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        numbers.replaceAll(number -> (number - number / divisor));
    }


    public static void main(String[] args) {
        Remainder remainder = new Remainder();
        List<Integer> input = new ArrayList<>(Arrays.asList(45, 13, 64, 51, 92, 33));
        remainder.changeNumbersToRemainders(input, 10);
        System.out.println(input);
        //remainder.printNumber(input);
        List<String> words = new ArrayList<>(Arrays.asList("Peti", "Laci", "Sanyi"));
        //words.replaceAll(word -> word.toUpperCase());
        //words.replaceAll(word -> remainder.firstTwoChars(word));
        System.out.println(words);
        //words.forEach(word -> System.out.println(word.toUpperCase()));

        words.removeIf(word -> word.contains("a"));
        System.out.println(words);
        words.forEach(String::toUpperCase);
        System.out.println(words);
        words.replaceAll(String::toUpperCase);
        System.out.println(words);
    }
}
