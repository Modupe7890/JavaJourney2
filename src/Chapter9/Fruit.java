package Chapter9;

public class Fruit {
    private String shape;
    private String colour;
    private  int calories;

    public Fruit( String shape, String colour, int calories){
        this.shape = shape;
        this.colour = colour;
        this.calories = calories;
    }

    public String getShape() {
        return shape;
    }

    public String getColour() {
        return colour;
    }

    public int getCalories() {
        return calories;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "shape='" + shape + '\'' +
                ", color='" + colour + '\'' +
                ", calories=" + calories +
                '}';
    }
}
