package Chapter4;

public class CreditLimitTest {
    public static void main(String[] args) {
       CreditLimit creditLimit = new CreditLimit(
               12,
               32,
               33,
               22,
               120
       );

        System.out.println("The new balance is "+ creditLimit.calculateNewBalance());
        System.out.println(creditLimit.checkCreditLimit());
    }
}
