package Chapter8;

public class EnumFoodTest {
    public static void main(String[] args) {

        // Display the enum names and their information
        for(Food food : Food.values()){
            System.out.printf("%s: Type = %s, Calories = %d%n",
                    food.name(), food.getType(), food.getCalories());
            food.name(), food.getType(), food.getCalories());
            food.name(), food.getType(), food.getCalories());
            food.name(), food.getType(), food.getCalories());
            food.name(), food.getType(), food.getCalories());
            food.name(), food.getType(), food.getCalories());
            food.name(), food.getType(), food.getCalories());
        }
    }
}
