package Chapter10;

import Chapter3.Employee;

// SalariedEmployee concrete class extends abstract class Employee.
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, Double.parseDouble(socialSecurityNumber));

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }
    // return salary

    public double getWeeklySalary() {
        return weeklySalary;
    }
    // calculate earnings; override abstract method earnings in Employee

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    // return String representation of SalariedEmployee object

    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
