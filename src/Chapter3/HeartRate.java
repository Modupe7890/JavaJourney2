package Chapter3;

public class HeartRate{
    private String firstName;
    private String lastName;
    private int month,day,year;
    private String dateOfBirth;
    private int calculateAge;
    private int age;
    private int maxHeartRate;
    private double targetHeartRate;

    public HeartRate(String firstName, String lastName, int month, int day, int year, String dateOfBirth){
    this.firstName=firstName;
    this.lastName=lastName;
    this.dateOfBirth = dateOfBirth;
    }
    public void setFirstName(String firstName){this.firstName=firstName;}

    public String getFirstName(){return firstName;}

    public void setLastName(String lastName){this.lastName=lastName;}

    public String getLastName() {return lastName;}

    public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth = month + "/" + day + "/" + year;
    }
    public String getDateOfBirth(){return dateOfBirth;}

    public void setCalculateAge(int calculateAge){
    this.calculateAge = 2023 - year;
    }
    public int getCalculateAge(){return calculateAge;}

    public void setMaxHeartRate(int maxHeartRate){
    this.maxHeartRate = 220 - calculateAge;
    }
    public int getMaxHeartRate(){return maxHeartRate;}

    public void setTargetHeartRate(double targetHeartRate){
    this.targetHeartRate = maxHeartRate * 0.5;
    }

    public double getTargetHeartRate() {
        return targetHeartRate;
    }

}