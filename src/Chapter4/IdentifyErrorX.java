package Chapter4;
public class IdentifyErrorX {
    public static void main(String[] args) {

        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
            System.out.printf("Total is %d%n", total);
        }
    }
}
