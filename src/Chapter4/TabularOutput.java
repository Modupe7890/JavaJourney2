package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("N\t10*N\t100*N\t1000*N");

        for (int i = 1; i <= 10; i++) {

            System.out.println(N + "\t" + (N * 10) + "\t" + (N * 100) + "\t" + (N * 1000));
            N++;
        }
    }
}
