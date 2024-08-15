package Chapter10;

import Chapter9.BasePlusCommissionEmployee;
import Chapter9.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        // assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
    }
}
