package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("szilva", null, "körte", "alma");

        for ( int i= 0; i< words.size(); i++) {
            try {
                char ch = words.get(i).charAt(0);
                System.out.println(ch);
            }
            catch (NullPointerException npe) {
                System.out.println("No first character exist");
            }
        }
    }
}

