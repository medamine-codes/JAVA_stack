import java.util.Random;
public class BankAccount{
    
    private static int numberOfAccounts = 0 ;
    private static double totalAmountStored = 0 ;
    private double checkingBalance ;
    private double savingsBalance ;
    private String accountNumber ;

    public void BankAccount(){
        this.checkingBalance = 0 ;
        this.savingsBalance = 0 ;
        this.accountNumber = generateRandomAccountNumber();
        numberOfAccounts ++ ;
    }
    public void deposit(double amount, String accountType) {
        if ("checking".equalsIgnoreCase(accountType)) {
            checkingBalance += amount;
        } else if ("savings".equalsIgnoreCase(accountType)) {
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }
    public void withdraw(double amount, String accountType ){
        if ("checking".equalsIgnoreCase(accountType)) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if ("savings".equalsIgnoreCase(accountType)) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }
    public void displayTotalMoney(){
        System.out.println("Total money stored: $" + totalAmountStored);

    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Checking Balance: $" + checkingBalance);
        System.out.println("Savings Balance: $" + savingsBalance);
        System.out.println("Total Balance: $" + (checkingBalance + savingsBalance));
    }
    private String generateRandomAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumberBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumberBuilder.append(random.nextInt(10));
        }
        return accountNumberBuilder.toString();
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalAmountStored() {
        return totalAmountStored;
    }
    
    
    
    
    
    
    
    
    public double getCheckingBalance(){
        return checkingBalance ;
    }
    public double getSavingsBalnace(){
        return savingsBalance ;
    }
}