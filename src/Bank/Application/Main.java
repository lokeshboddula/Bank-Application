package Bank.Application;

public class Main {
    public static void main(String[] args) {
        SBIBank.rateOfInterest = 7;

        HDFCBank.rateOfInterest = 6;
        SBIBank account1 = new SBIBank("Akshay", "1234", 100000);

        SBIBank account2 = new SBIBank("Basit", "123", 156000);

        HDFCBank account3 = new HDFCBank("Bhola", "789", 123456);

        //check balance
        System.out.println(account1.checkBalance("1234"));

        //check balance
        System.out.println(account3.checkBalance("789"));

        //addMoney
        String messageForAcct2 = account2.addMoney(4000);
        System.out.println(messageForAcct2);

        //withdraw money // SBI Bank
        String messageForAcct3 = account3.withdrawMoney(150000, "789");
        System.out.println(messageForAcct3);

        //total interest for 3 years // HDFC Bank
        System.out.println(account3.totalInterest(3));
    }
}