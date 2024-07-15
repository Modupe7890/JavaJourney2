package Chapter9;

public class CommissionEmployeeTest {
    public static void main(String[] args) {

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
                "222-22-2222", 10000, 0.06);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First Name is: ", commissionEmployee.getFirstName());
        System.out.printf("%s %s%n", "Last Name is: ", commissionEmployee.getLastName());
        System.out.printf("%s %s%n", "Social security number is: ", commissionEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales is: ", commissionEmployee.getGrossSales());

        commissionEmployee.setGrossSales(5000);
        commissionEmployee.setCommissionRate(.1);
        System.out.printf("%n%s : %n%n%s%n", "Updated Information obtained by toString", commissionEmployee);
    }
}
