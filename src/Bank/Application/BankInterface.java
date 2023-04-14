package Bank.Application;

public interface BankInterface {
    int checkBalance(String password);

    String addMoney(int money, String password);

    String addMoney(int money);

    String withdrawMoney(int money, String password);

    String changePassword(String oldPassword, String newPassword);

    double totalInterest(int years);

    /*
    * TODO
    * we can add tranfer money feature within the bank
    *  */
}
