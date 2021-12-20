package interfacedependencyinversion.amount;

public class Cash implements  Payable{

    @Override
    public int getPayableAmount(int amount) {

        int lastDigit = amount % 5;
        if ( lastDigit < 3) {
            amount -= lastDigit;
        } else if (lastDigit < 5 ) {
            amount = amount - lastDigit +5;
        }
        return amount;
    }
}
