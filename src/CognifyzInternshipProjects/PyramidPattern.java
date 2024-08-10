package CognifyzInternshipProjects;

public class PyramidPattern {
    public static void main(String[] args) {
        // number of rows
        int number = 4;
        for(int i = 1; i <= number; i++){
            for (int j = number - 1; j > 0; j--){
                System.out.println("   ");
            }
            for(int k = 1; k <= number; k++){
                System.out.println("  ");
            }
            System.out.println();
        }
    }
}
