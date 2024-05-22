package Chapter3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int month,day,year;
    private String gender;
    private String dateOfBirth;
    private int calculateAge;
    private int age;
    private double height;
    private double weight;
    private int maxHeartRate;
    private double targetHeartRate;
    private double bodyMassIndex;

    public HealthProfile(String firstName, String lastName, int month, int day, int year,
                         String gender,String dateOfBirth, double height, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender() {
        return gender;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight){
        this.weight = weight * 2.205;
    }
    public double getWeight() {
        return weight;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = month + "/" + day + "/" + year;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setCalculateAge(int calculateAge)
    {
        this.calculateAge = 2023 - year;
    }
    public int getCalculateAge(){
        return calculateAge;
    }
    public void setMaxHeartRate(int maxHeartRate)
    {
        this.maxHeartRate = 220 - calculateAge;
    }
    public int getMaxHeartRate(){
        return maxHeartRate;
    }
    public void setTargetHeartRate(double targetHeartRate)
    {
        this.targetHeartRate = maxHeartRate * 0.5;
    }
    public double getTargetHeartRate() {
        return targetHeartRate;
    }

    public void setBodyMassIndex(double bodyMassIndex)
    {
        double weigth = 0;
        this.bodyMassIndex = ((weigth) / (height * height));
    }
    public double bodyMassIndex() {
        return bodyMassIndex();
    }
}

