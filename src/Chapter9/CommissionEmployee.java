package Chapter9;

public class CommissionEmployee extends Object{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final double grossSales;
    private final double commissionRate;

    // Constructors
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate){
        // implicit call to Object's default constructor occurs here

        // if grossSales is invalid throw exception
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
    }
}
