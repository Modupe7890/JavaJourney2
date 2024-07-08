package Chapter8;

public class Employee {
    private  String FirstName;
    private  String LastName;
    private Date BirthDate;
    private Date HireDate;

    // constructor to initialize name, birth date and hire date
    public Employee(String FirstName, String LastName, Date BirthDate, Date HireDate){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.HireDate = HireDate;
    }
    // convert Employee to String format
    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", LastName, FirstName, HireDate, BirthDate);
    }
}
