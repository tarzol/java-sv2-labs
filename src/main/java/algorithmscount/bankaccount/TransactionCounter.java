package algorithmscount.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class TransactionCounter {

    public int sumOfBelowMinTransactions (List<Transaction> transactionList, int minTransaction) {
        int count = 0;
        for (Transaction transaction : transactionList) {
            if ( transaction.getTransactionType().name().equals("CREDIT") && transaction.getAmount()>minTransaction) {
                System.out.println(transaction.getTransactionType().name());
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TransactionCounter transactionCounter = new TransactionCounter();
        Transaction transaction0 = new Transaction("1234", TransactionType.CREDIT, 1000  );
        Transaction transaction1 = new Transaction("1234", TransactionType.CREDIT, 2000  );
        Transaction transaction2 = new Transaction("1234", TransactionType.CREDIT, 3000  );
        Transaction transaction3 = new Transaction("1234", TransactionType.CREDIT, 4000  );
        Transaction transaction4 = new Transaction("1234", TransactionType.DEBIT, 6000  );

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(transaction0);
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        transactionList.add(transaction3);
        transactionList.add(transaction4);
        System.out.println("Az eredmény: "+transactionCounter.sumOfBelowMinTransactions(transactionList, 2000));
    }
}
