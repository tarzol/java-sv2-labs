package chars;

public class Words {

    public String pushWord (String word) {
        char[] wordArray = word.toCharArray();
        for (int i=0; i < wordArray.length; i++) {
            wordArray[i] = (char)(wordArray[i]+1);
        }
        String newWord = new String(wordArray);
        return newWord;
    }
}
