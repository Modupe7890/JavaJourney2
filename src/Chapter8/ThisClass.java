package Chapter8;
// this used implicitly and explicitly to refer to members of an object.
public class ThisClass {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}
// class SimpleTime demonstrates the "this" reference
    class SimpleTime{
    private int hour;           // 0 - 23
    private int minutes;        // 0 - 59
    private int second;         // 0 - 59
        // if the constructor uses parameter names identical to
        // instance variable names the "this" reference is
        // required to distinguish between the names

    public SimpleTime (int hour, int minutes, int second){

    }
    }
