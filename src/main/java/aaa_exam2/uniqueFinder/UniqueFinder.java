package aaa_exam2.uniqueFinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String text) {
        List<Character> result = new ArrayList<>();
        //átalakítás karakter tömbbé
        if ( text == null) {
            throw new IllegalArgumentException("Text is null.");
        }

        char[] chars = text.toCharArray();
        //az egyes karakterek szűrése és belerakása a tömbbe

        for ( char ch : chars) {
            if (!result.contains(ch)) {
                result.add(ch);
            }
        }
        return result;
    }
}
