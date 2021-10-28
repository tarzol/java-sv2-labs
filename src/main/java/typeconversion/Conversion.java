package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double doubleTypeNumber){
        double backDouble = (double) ((int) doubleTypeNumber);
        return backDouble;
    }
    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] byteArray = new byte[numbers.length];
        for (int i=0; i<numbers.length; i++ ) {
            if (numbers[i] >=0 && numbers[i] <=127) {
                byteArray[i] = (byte) numbers[i];
            } else {
                byteArray[i] = -1;
            }
        }
        return byteArray;
    }

    public double getFirstDecimal(double number) {
        int firstDigit= 0;
        int intPart = (int) number;
        firstDigit = (int) (10*(number - intPart));
        return firstDigit;
    }
}
