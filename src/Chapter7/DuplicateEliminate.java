package Chapter7;
import java.util.Scanner;
public class DuplicateEliminate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] uniqueNum = new int[5];
        int count = 0;
        System.out.println("Enter five numbers between 10 to 100: ");

        for(int i = 0; i < 5; i++ ){
            int newNum = scanner.nextInt();

            if(newNum < 10 || newNum >100){
                System.out.println("Numbers must be between 10 and 100: ");
                i--;
            }
             boolean isDuplicate = false;
            for(int j = 0; j < 5; j++){
                if(uniqueNum[j] == newNum){
                    isDuplicate = true;

                    break;
                }
            }
                if(!isDuplicate){
                    uniqueNum[count] = newNum;
                    count++;

                    System.out.print("Unique Numbers: ");
                    for(int k = 0; k < count; k++){
                        System.out.println(uniqueNum[k] +" ");
                    }
                    System.out.println();
                }
                else{
                    System.out.println("Duplicate number, not added");
                }
        }

    }

}
