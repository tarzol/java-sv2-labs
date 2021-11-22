package algorithmscount.bankaccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountConditionCounter {

    public int sumOfBankAccount (List<BankAccount> accounts, int minimumLimit) {
        int count = 0;
        for (BankAccount account: accounts) {
            if (account.getBalance()>minimumLimit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();
        BankAccount bankAccount1 = new BankAccount("Zoli","1234", 1000);
        BankAccount bankAccount2 = new BankAccount("Peti","1234", 10000);
        BankAccount bankAccount3 = new BankAccount("Laci","1234", 100000);
        BankAccount bankAccount4 = new BankAccount("Kai","1234", 1000000);
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(bankAccount1);
        bankAccountList.add(bankAccount2);
        bankAccountList.add(bankAccount3);
        bankAccountList.add(bankAccount4);
        int minimumLimit = 15000;
        System.out.println("A minimumot meghaladók száma: "+bankAccountConditionCounter.sumOfBankAccount(bankAccountList, minimumLimit));
    }
}
