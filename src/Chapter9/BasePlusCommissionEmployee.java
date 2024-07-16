package Chapter9;

public class BasePlusCommissionEmployee {
    private  final String firstName;
    private  final String lastName;
    private  final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary){
    }
    if(grossSales < 0.0){
        throw new IllegalArgumentException("Gross sales must be >= 0.0");
}
