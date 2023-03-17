package Enums;

public enum AnimalType{
    ROOSTER(" петух"),
    FOX(" лисица"),
    SHEEP(" овец"),
    RABBIT("кроликов"),
    LITTLEBIRD("крошечная летающая козявка"),
    MAGPIE ("сороки");



    private String title;

    AnimalType(String title) {
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