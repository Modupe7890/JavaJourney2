package CognifyzInternshipProjects;

public class PyramidPattern {
    public static void main(String[] args) {
        // number of pattern rows
        int number = 4;
        for(int i = 0; i <= number; i++){
            for (int j = number - 1; j > 0; j--){
                if(j <= i){
                    System.out.println(j);
                }else {
                    System.out.println(" ");
                }
            }
            for(int k = 2; k <= number; k++){
                System.out.println(k);
            }
            System.out.println(" ");
        }
    }
}
