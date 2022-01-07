package exceptionresource;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                char[] chars = line.toCharArray();
                int count = 0;
                for (char ch: chars) {
                    if (Character.isLetter(ch)) {
                        sb.append(ch);
                        count++;
                    }
                }
                if (count == 0 ) {
                    sb.append(" ");
                }
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be opened.", ioe);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HiddenWord hw = new HiddenWord();
        hw.getHiddenWord(Paths.get("src/test/resources/hiddenword.txt"));
    }
}
