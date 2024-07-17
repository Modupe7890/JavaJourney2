package Chapter9;

public class BasePlusCommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private  double baseSalary;

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales,double commissionRate, double baseSalary){
        //implicit call to Object's default constructor occurs here
        // if grossSales is invalid throw exception
         if (grossSales < 0.0) {
                throw new IllegalArgumentException("Gross sales must be >= 0.0");
         }
}
