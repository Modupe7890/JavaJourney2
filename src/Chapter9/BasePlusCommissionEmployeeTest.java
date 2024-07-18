package Chapter9;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333",
                        5000, .04, 300);
        // get base-salaried commission employee data
        System.out.printf("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",employee.getSocialSecurityNumber());
    }
}
