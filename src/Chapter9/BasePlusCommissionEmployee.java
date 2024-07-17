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
                                      double grossSales,double commissionRate, double baseSalary) {
        //implicit call to Object's default constructor occurs here
        // if grossSales is invalid throw exception
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }
    // return first name
     public String getFirstName() {
        return firstName;}
    // return lastName
    public String getLastName(){
        return lastName;
    }
    // return social security number
     public String getSocialSecurityNumber() {
        return socialSecurityNumber;
     }
     // set gross sales amount
     public void setGrossSales(double grossSales) {
         if (grossSales < 0.0) {
             throw new IllegalArgumentException("Gross sales must be >= 0.0");
         }
         this.grossSales = grossSales;
     }
    // return gross sales amount
     public double getGrossSales() {
        return grossSales;
     }
     // set commission rate
     public void setCommissionRate(double commissionRate) {
         if (commissionRate <= 0.0 || commissionRate >= 1.0) {
             throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
         }
         this.commissionRate = commissionRate;
     }
    // return commission rate
     public double getCommissionRate() {
        return commissionRate;
    }
}
