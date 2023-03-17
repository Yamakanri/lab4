package Enums;

import Actors.Person;

public enum Item {
    GIFT ("подарок"),
    PISTOL("пистолет"),
    SPOON("серебрянная ложечка"),
    GLASS("Синенький стаканчик"),
    TREASURES("сокровища"),
    PICTURES("картин(а/ы)"),
    BOTS("ботинки");






    private String title;


    Item(String title) {
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