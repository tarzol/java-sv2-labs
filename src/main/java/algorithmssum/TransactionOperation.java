package algorithmssum;

public enum TransactionOperation {
    CREDIT(1), DEBIT(-1);

    int value;

    TransactionOperation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
