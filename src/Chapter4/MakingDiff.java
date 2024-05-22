package Chapter4;

public class MakingDiff {
    public static void main(String[] args) {
        double population = 8.8;
        double growthRate = 5.9;
        double Total;


        System.out.printf("%s%s%50s%n", "Year", "Anticipated World Pop", "Increase in World Pop");

        for (int year = 1; year <= 75; ++year){
            Total = population * Math.pow(1.0 + growthRate, year);

            System.out.printf("%4d%,50.2f%n", year, Total);

        }





    }
}
