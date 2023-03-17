package Enums;

public enum Food{
    BUNS(" Булочки", 200 ),
    PIE("Пирог", 1000),
    JUICE ("Сок", 150);




    private final String title;
    private final int calories;

    Food(String title, int calories) {
        this.title = title;
        this.calories = calories;
    }

    public String getTitle() {
        return title;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return title;
    }
}