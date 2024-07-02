package Chapter8;
// this used implicitly and explicitly to refer to members of an object.
public class ThisClass {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}
