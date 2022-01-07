package exceptionmulticatch.converter;

import java.sql.Array;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String values) {
        if (values == null) {
            throw new NullPointerException("Account list should not be null!");
        }
        boolean[] falseTrues = new boolean[values.length()];

        for (int i = 0; i < values.length(); i++) {
            char ch = values.charAt(i);

            if (ch == '0' ) {
                falseTrues[i] = false;
            } else if ( ch == '1' ) {
                falseTrues[i] = true;
            } else {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
        }

        return falseTrues;
    }

    public String booleanArrayToBinaryString(boolean[] values) {
        if (values == null) {
            throw new NullPointerException("Account list should not be null!");
        }
        if ( values.length == 0 ) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        StringBuilder booleanString = new StringBuilder();
        for (int i = 0; i < values.length; i++ ) {
            if (values[i] == true ) {
                booleanString.append('1');
            } else {
                booleanString.append('0');
            }
        }
        return booleanString.toString();
    }
}
