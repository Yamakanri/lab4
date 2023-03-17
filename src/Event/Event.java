package Event;
import Location.Town;
import Enums.Place;

public class Event {
    private final String eventName;

    public Event(String eventName){
        this.eventName = eventName;
    }

    public static void getEventLocation( Place place, String eventName){
        System.out.println("В " + place + eventName);
    }
    public static void getEventLocation(Town.Flat flat, String eventName){
        System.out.println("В " + flat.getName() + eventName);
    }
    public static void getEventLocation(Town town, String eventName){
        System.out.println("В " + town.getName() + eventName);
    }



    public static void getEventDetails(String eventName,String details, String details1, String details2, Place place ){
        if ((details1 == null) & (details2 == null)){
            System.out.println(eventName + details  + place);
        } else if (details2 == null ){
            System.out.println(eventName + details + details1 + place);
        } else {
            System.out.println(eventName + details + details1 + details2 + place);
        }
    }

    public String getEventName() {
        return eventName;
    }
}
