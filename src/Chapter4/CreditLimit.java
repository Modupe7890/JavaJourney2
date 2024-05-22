package Chapter4;
public class CreditLimit {

    private int accountNumber;
    private int startBalance;
    private int totalItemsCharged;
    private int totalCreditsApplied;
    private int creditLimit;
    private int newBalance;
    public CreditLimit(int accountNumber,
                       int startBalance,
                       int totalItemsCharged,
                       int totalCreditsApplied,
                       int creditLimit) {
        this.accountNumber = accountNumber;
        this.startBalance = startBalance;
        this.totalItemsCharged = totalItemsCharged;
        this.totalCreditsApplied = totalCreditsApplied;
        this.creditLimit = creditLimit;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getStartBalance() {
        return startBalance;
    }
    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }
    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }
    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }
    public int getTotalCreditsApplied() {
        return totalCreditsApplied;
    }

    public void setTotalCreditsApplied(int totalCreditsApplied) {
        this.totalCreditsApplied = totalCreditsApplied;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    public int calculateNewBalance() {
        newBalance = startBalance + totalItemsCharged - totalCreditsApplied;
        return newBalance;
    }
    public String checkCreditLimit() {
        if(newBalance > creditLimit){
            return "Credit Limit Exceeded";
        }else {
            return "Credit Limit not exceeded";
        }
    }
}
