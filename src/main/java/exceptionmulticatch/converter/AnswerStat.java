package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String except) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(except);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }



    public int answerTruePercent(String item) {
        boolean[] booleans = convert(item);
        int numberOfTrue = 0;
        for (int j = 0; j < booleans.length; j++) {
            if (booleans[j]) {
                numberOfTrue++;
            }
        }
        return (int) Math.round((double) numberOfTrue / booleans.length * 100);
    }
}
