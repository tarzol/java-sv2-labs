package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
         for (int i=0; i<source.length; i++ ) {
             source[i] = source[i] + i;
             System.out.println(source[i]);
         }
    }

    public void concatenateIndexToWord(String[] source) {
        for ( int i = 0; i<source.length; i++) {
            source[i] = i + source[i];
            System.out.println(source[i]+" ");
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] intNumbers = new int[]{10, 10, 30};
        String[] words = new String[]{"tíz", "húsz", "harminc"};

        arrayHandler.addIndexToNumber(intNumbers);
        arrayHandler.concatenateIndexToWord(words);

        for (int i : intNumbers) {
            System.out.print(i + ", ");
        }

        System.out.println();
        for (String i : words) {
            System.out.print(i + ", ");
        }
    }
}
