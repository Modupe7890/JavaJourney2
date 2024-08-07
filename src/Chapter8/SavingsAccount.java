package Chapter8;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingBalance;

    public SavingsAccount(double balance){
        this.savingBalance = balance;
    }
    public void calculateMonthlyInterest (){
        double monthlyInterest = (savingBalance * annualInterestRate) / 12;
        this.savingBalance += monthlyInterest;
    }
    public static void modifyInterestRate (double newRate){
        annualInterestRate = newRate;
    }
    public double getBalance(){
        return this.savingBalance;
    }
}
