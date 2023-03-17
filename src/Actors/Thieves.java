package Actors;


import Enums.AnimalType;
import Enums.EnergyLevel;
import Enums.Place;
import Enums.Item;
import Exceptions.PersonHasNotNameException;
import Exceptions.PersonIsTooOldException;
import Interfaces.Doable;
import Interfaces.Movementable;
import Interfaces.Shoutable;

public class Thieves extends Marginals implements Doable, Shoutable, Movementable {
    public Thieves(String name, int age, EnergyLevel energyLevel) throws PersonHasNotNameException, PersonIsTooOldException {
        super(name, age, energyLevel);
    }
    public static void shout(Thieves thieves1, Thieves thieves2, Place place) { // персонажи кричят где-то
        System.out.println(thieves1 + " и " + thieves2 + " закричали в " + place);
    }
    public static void fame(Thieves thieves1, Thieves thieves2, String fameAs, Place place) { //персонажи известны за что-то где-то
        System.out.println(thieves1 + " и " + thieves2 + " известны как" + fameAs + " в " + place);
    }
    public static void comparatorWithAnimal(Thieves thieves1, Thieves thieves2, AnimalType animalType) { //персонажей сравнивают с животным
        System.out.println(thieves1 + " и " + thieves2 + " как " + animalType);
    }
    public static void steal(Thieves thieves1, Thieves thieves2, String stolenThings){ //персонажи крадут что-то
        System.out.println(thieves1 + " и " + thieves2 + " крадут "  + stolenThings);
    }
    public static void rob(Thieves thieves1, Thieves thieves2, Place place) { // персонажи устроили ограбление чего-то
        System.out.println(thieves1 + " и " + thieves2 + " пытались обокрасть " + place);
    }
    public static void danger(Thieves thieves1, Thieves thieves2, Person person) { //персонажи создают опасность кому-то
        System.out.println(thieves1 + " и " + thieves2 + " создают опасность для " + person.getName());
    }
    public static void action(Thieves thieves1, Thieves thieves2, String actionName){ // персонажи совершают какое то дейстиве не требующее отдельного метода
        System.out.println(thieves1 + " и " + thieves2 + actionName);
    }


    @Override
    public void move( Person person2, Place place1, Place place2) {

    }

    @Override
    public void toDo(String action, Item item) {

    }
}
