package exceptionclass.bank;

import exceptionclass.course.InvalideTimeException;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null ) {
            throw new InvalideTimeException("Account number is not provided!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        maxSubtract = 10000;
    }

    public void subtract(double subtractAmount) {
        if (subtractAmount > maxSubtract || subtractAmount > balance) {
            throw new InvalidAmountBankOperationException("The subtraction is too high");
        }
        balance -= subtractAmount;
    }

    public void deposit(double depositAmount) {
        if (depositAmount < 0 ) {
            throw new InvalidAmountBankOperationException("The deposit should be above zero! ");

        }
        balance += depositAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

}
