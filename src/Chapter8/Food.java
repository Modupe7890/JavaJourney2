package Chapter8;

public enum Food {
    APPLE("Fruit", 52),
    BANANA("Fruit", 89),
    CARROT("Vegetable", 41);

    private final String type;
    private final int calories;

    Food(String type, int calories) {
        this.type = type;
        this.calories = calories;
    }

    public String getType() {
        return type;
    }
}
