//package Chapter10;
//
//public abstract class Employee{
//        private final String firstName;
//        private final String lastName;
//        private final String socialSecurity;
//
//        //Constructor
//
//    public Employee(String firstName, String lastName, String socialSecurity) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.socialSecurity = socialSecurity;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getSocialSecurity() {
//        return socialSecurity;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//    // return String representation of Employee object
//
//    @Override
//    public String toString() {
//        return String.format("%s %s%n social security number: %s",
//                30, getFirstName(), getLastName(), getSocialSecurityNumber());
//    }
//    // abstract method must be overridden by concrete subclasses
//    public abstract double earnings(){
//
//    }
//}
//
