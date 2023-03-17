package Location;

import java.util.ArrayList;

public class Town {
    private String name;
    private String description;

    public Town(String name, String description) {
        this.name = name;
        this.description = description;

    }


    public static class Flat { //статический вложенный класс
        String name;
        private int countOfRooms;
        private int countOfPeople;
        private String color;

        public Flat(String name, int countOfPeople, int countOfRooms) {
            this.name = name;
            this.countOfRooms = countOfRooms;
            this.countOfPeople = countOfPeople;
        }

        public String toString() {
            return (name + " в которой " + countOfRooms + "комнат и живет " + countOfPeople);
        }

        public String getName() {
            return name;
        }
    }

    public String getName() {
        return name;
    }
}


