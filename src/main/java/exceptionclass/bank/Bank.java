package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null || accounts.size() == 0 ) {
            throw new InvalidBankOperationException("The list of accounts cannot be empty!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        Account account = findAccountNumber(accountNumber);
    }

    private Account findAccountNumber(String accountNumber) {
        int accountIndex = -1;
        for ( int i = 0; i < this.accounts.size(); i++) {
            if ( accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accountIndex = i;
            }
        }
        if (accountIndex == -1 ) {
            throw new InvalidAccountNumberBankOperationException("The given account does not exist!");
        }
        return this.accounts.get(accountIndex);
    }
}
