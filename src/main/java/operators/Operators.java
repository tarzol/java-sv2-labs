package operators;

public class Operators {
    public boolean isEven(int n) {
        boolean ifOdd = false;
        if (n%2 == 0) {
            ifOdd = true;
        }
        return  ifOdd;
    }

    public String getResultOfDivision(int number, int divisor) {
        String result ="";
        int newNumber = number/divisor;
        int rest = number-newNumber*divisor;
        result = number+"/"+divisor+"="+newNumber+", maradék: "+rest;
        return result;
    }

    public String isNull(String s) {
        String textFeedBack = "null";
        if ( s != null) {
            textFeedBack = "nem null";
        }
        return textFeedBack;
    }

    public boolean isEmpty(String s) {
        boolean isEmpty = false;
        if ( s == null || s.length() < 1  ) {
            isEmpty = true;
        }
        return isEmpty;
    }
}
