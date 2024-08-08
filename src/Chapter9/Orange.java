package Chapter9;

public class Orange extends Fruit {
    public Orange(String shape, String colour, int calories) {
        super(shape, colour, calories);
    }

        @Override
                public String toString () {
            return "Orange{" +
                    "shape='" + getShape() + '\'' +
                    ", colour='" + getColour() + '\'' +
                    ", calories=" + getCalories() +
                    '}';
        }
}
