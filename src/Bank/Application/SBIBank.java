package Bank.Application;

import java.util.UUID;

public class SBIBank implements BankInterface{
    private String password;
    private int balance;
    private String name;
    private String accountNumber;
    public static double rateOfInterest;

    public SBIBank(String name,String password, int balance) {
        this.password = password;
        this.balance = balance;
        this.name = name;
        this.accountNumber = UUID.randomUUID().toString();
    }

    SBIBank() {

    }
    @Override
    public int checkBalance(String password) {
        if(password.equals(this.password))
            return balance;

        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance  = balance + money;
        return "" + money + " added successfully to " + accountNumber;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(money <= balance) {
            balance = balance - money;
            return "" + money + " added successfully to " + accountNumber
                    + "remaining balance is " + balance;
        }
        return "Insufficient balance!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password)) {
            this.password = newPassword;
            return "password updated!";
        } else {
            return "incorrect current password!";
        }
    }

    @Override
    public double totalInterest(int years) {
        return (balance * rateOfInterest * years) / 100;
    }
}
