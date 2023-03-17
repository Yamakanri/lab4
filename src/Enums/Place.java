package Enums;

public enum Place {
    FENCE ("заборчик"),
    KITCHEN ("кухня"),
    ROOF ("крыша"),
    ROOFTOP_HOUSE ("домик на крыше"),

    NOWHERE("Нигде в мире"),
    PORCH ("крыльцо"),
    WALL ("стена"),
    ATTIC ("мансарда"),
    SIDEWALK("тротуар"),
    SKY("небо"),
    VAZASTAN ("Вазастан"),
    FLAT_SVANTSEN ("квартира Свентсенов"),
    ROOM ("комната"),
    HOME ("дом(e) "),
    STREET("улица"),
    WINDOW("окно");


    private String title;

    Place(String title) {
        this.title = title;
    }
    public static void getPlaceDetails(Place place, String details){
        System.out.println( "На " + place + details);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}