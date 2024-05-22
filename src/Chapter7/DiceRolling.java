package Chapter7;
import java.util.Random;
public class DiceRolling {
    public static void main(String[] args) {
        int[] sum = new int[11];

        Random random = new Random();

        for(int i = 0; i < 36000000; i++){
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;

            int total = die1 + die2;
            sum[total - 2]++;
        }
            System.out.println("Sum\tFrequency");
            System.out.println("----------------");
            for (int i = 0; i < sum.length; i++){
                    int total = i + 2;
                System.out.println(total + "\t" + sum[i]);
            }
    }

}
