package Chapter8;

public class SavingsAccountTest {
    public static void main(String[] args) {
        // Instantiate two SavingsAccount objects with initial balances
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate the monthly interest for each of 12 months
        System.out.println("Balances after 12 months with 4% annual interest rate:");
        for(int month = 1; month <= 12; month++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d: Saver1 Balance: %.2f, Saver2 Balance: %.2f%n",
                    month, saver1.getBalance(), saver2.getBalance());
        }
    }
}
