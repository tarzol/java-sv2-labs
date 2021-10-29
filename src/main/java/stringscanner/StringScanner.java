package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner("Ez egy olyan mondat, amely több tagmondatból áll, és ezért megfelel a feladatkiírásnak.");
        Scanner scan2 = new Scanner("Ez pedig a  következő mondat, amit kiíratok, mert ez a feladat.").useDelimiter(",");

        List<String> sentences = new ArrayList<>();
        while (scan2.hasNext()) {
            String s = scan2.next();
            System.out.println(s);
            sentences.add(s);
        }
        for (String s : sentences) {
            System.out.println(s);
        }
        //System.out.println(sentences);
    }
}
