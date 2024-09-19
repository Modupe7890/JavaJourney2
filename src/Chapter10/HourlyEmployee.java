package Chapter10;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    //Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) { // validate wage
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if ((hours < 0.0) || (hours > 168.0)) { // validate hours
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
    }
}
