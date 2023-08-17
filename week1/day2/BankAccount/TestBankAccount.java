public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.deposit(1000, "checking");
        account1.deposit(500, "savings");

        account2.deposit(1500, "checking");
        account2.deposit(800, "savings");

        account1.withdraw(200, "checking");
        account2.withdraw(1000, "savings");

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.displayTotalMoney();
        account2.displayTotalMoney();

        System.out.println("Number of Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total Amount Stored: $" + BankAccount.getTotalAmountStored());
    }
}