package Chapter5;

public class PythagoreanTriple {
    public static void main(String[] args) {

        int side1 =0;
        int side2 =0;
        int Hypotenuse =0;
        System.out.printf("%s%10s%15s%n", "Side1", "Side2", "Hypotenuse");

        for(int a = 1; a <= 500; a++) {
            side1 = a * a;
        }
            for(int b = 1; b <= 500; b++) {
                side2 = b * b;
            }
                for(int c = 1; c <= 500; c++) {
                    Hypotenuse = c * c;
                }
                    if(side1 + side2 == Hypotenuse) {
                        System.out.printf("%5d%10d%15d%n", side1, side2, Hypotenuse);
                    }

    }
}
