package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum +=transaction.getTransactionOperation().getValue()*transaction.getAmount();
        }
        return sum;
    }

    public static void main(String[] args) {
        TransactionSumCalculator transactionSumCalculator = new TransactionSumCalculator();
        Transaction transaction1 = new Transaction("1234", TransactionOperation.CREDIT, 1000);
        Transaction transaction2 = new Transaction("1234", TransactionOperation.CREDIT, 2000);
        Transaction transaction3 = new Transaction("1234", TransactionOperation.DEBIT, 3000);
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        transactionList.add(transaction3);

        System.out.println("Az összes tranzakció utáni összeg: "+transactionSumCalculator.sumAmountOfCreditEntries(transactionList));
    }
}

/*this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;*/