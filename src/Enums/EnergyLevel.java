package Enums;


public enum EnergyLevel{
    MINIMAL("Минимальный"),
    LOW("Низкий"),
    MEDIUM("Средний"),
    HIGH("Высокий"),
    MAXIMAL("Максимальный");


    private String title;

    EnergyLevel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}