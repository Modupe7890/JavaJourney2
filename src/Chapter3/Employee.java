package Chapter3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthSal;
    private double yearlySalary;

    public Employee (String firstName, String lastName, double monthSal){
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthSal>0.0) {
            this.monthSal = monthSal;
        }
        this.yearlySalary = monthSal*12;
    }

        public void setFirstName(String firstName) {
        this.firstName=firstName;}

        public String getFirstname(){
            return firstName;
        }
        public void setLastName(String lastName) {this.lastName = lastName;}

        public String getLastName(){
            return lastName;
        }
        public void setMonthSal(double monthSal) {this.monthSal = monthSal;}

        public double getMonthSal(){
        return monthSal;
        }
        public double getYearlySalary(){
        return yearlySalary;
        }

}