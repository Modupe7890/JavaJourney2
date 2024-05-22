package Chapter3;
public class Account {
    private String name; // instance variable
    private double balance;
    public Account (String name, double balance) {
        this.name = name;

        if (balance >0.0) {
        this.balance = balance;
        }
    }
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    public void withdraw(double withdrawAmount){
       if (withdrawAmount>0&&withdrawAmount<=balance){
           withdrawAmount = withdrawAmount - balance;
           System.out.println("Transaction Successful");
       }
       if (withdrawAmount<=0&&withdrawAmount>balance){
           withdrawAmount =withdrawAmount-balance;
           System.out.println("Withdrawal Amount Exceeded Account Balance");
       }
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}

