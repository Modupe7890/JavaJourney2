package Chapter4;
public class SalesCommission {
    public static void main(String[] args) {
     double item1 = 239.99;
     double item2 = 129.75;
     double item3 = 99.95;
     double item4 = 350.89;

     double totalItemValue =
             item1 + item2 + item3 + item4;
     double SalesEarning = 18 * totalItemValue;

        System.out.printf("Sales Earning is " +SalesEarning);
    }

}
