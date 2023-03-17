package Actors;

import Enums.*;

import Exceptions.PersonHasNotNameException;
import Exceptions.PersonIsTooOldException;
import Interfaces.*;

public class Human extends Person implements Doable, Eatable, Thinkable, Listenable,
        Sayable, Smellable, Sittable, Movementable, Feelable,Seeable {
    public Human(String name, int age, EnergyLevel energyLevel) throws PersonHasNotNameException, PersonIsTooOldException {
        super(name, age, energyLevel);

    }

    @Override
    public void toDo(String action, Item item) {
        if (item == null) {
            System.out.println(getName() + action); // просто действие не относящееся, для которого не нужно выделять метод
        } else {
            System.out.println(getName() + action + item); // действие с обьектом
        }
    }

    @Override
    public void eat(Person person2, String action, Food food, Food food2) { //метод употребления еды
        if ((person2 == null) & (food2 == null)) {
            System.out.println(getName() + action + food);
        } else if (person2 == null) {
            System.out.println(getName() + action + food + " и " + food2);
        } else if (food2 == null) {
            System.out.println(getName() + " и " + person2 + action + food);
        } else {
            System.out.println(getName() + " и " + person2 + action + food + " и " + food2);
        }

    }

    @Override
    public void listen(String sound) { // персонаж слышит звуки
        System.out.println(getName() + " слышит " + sound);
    }

    @Override
    public void smell(String odor) { //персонаж чувствует запах чего-то
        System.out.println(getName() + " чувствует запах " + odor);
    }

    @Override
    public void think(String thought) {
        class Idea{ //локальный класс
        public boolean goodIdea(){
            return Math.random() > 0.1;
            }
        }
        Idea idea = new Idea();
        while (!idea.goodIdea()){
            System.out.println("У " + getName() + " крутится много мыслей в голове"); // с шансом 10% малыш не может придумать хорошую мысль
        }
        System.out.println(getName() + " подумал: " + thought);

    }

    @Override
    public void say(String action, Person person, String someWords) {
        if (action == null) {
            System.out.println(getName() + " сказал " + person.getName() + someWords); // персонаж сказал что то
        } else {
            System.out.println(getName() + action + person.getName() + someWords);
        }
    }

    @Override
    public void see(String description, Place place) {
        if (place == null) {
            System.out.println(getName() + description);// персонаж видит что то
        } else {
            System.out.println(getName() + description + place);// персонаж видит что то и где-то
        }
    }

    @Override
    public void feel(EmotionalCondition emotionalCondition, String feeling, String feeling2, String feeling3) { //чувства и ощущения персонажа, одно или несколько
        if (feeling3 == null) {
            System.out.println(getName() + " чувствует" + emotionalCondition + ". " + getName() + feeling + " и " + feeling2);
        }
        if ((feeling3 == null) & (feeling2 == null)) {
            System.out.println(getName() + " чувствует" + emotionalCondition + ". " + getName() + feeling);
        }
        if ((feeling3 != null) & (feeling2 != null)) {
            System.out.println(getName() + " чувствует" + emotionalCondition + ". " + getName() + feeling + " и " + feeling2 + " и " + feeling3);
        }
    }

    @Override
    public void sit(String pretext, Place place) { //персонаж сидит в каком то месте
        System.out.println(getName() + " сидит" + pretext + place);
    }


    public void paint(Item item, String stuffAction, Place place) {
        if (place == null) {
            System.out.println(getName() + " нарисовал " + item + " и " + stuffAction); // персонаж что то нарисовал и сделал с этим что-то
        } else {
            System.out.println(getName() + " нарисовал " + item + " и " + stuffAction + place);// персонаж нарисовал что-то и сделал с этим сто-то и где-то
        }
    }

    @Override
    public void move(Person person2, Place place1, Place place2) {
        if (person2 == null) {
            System.out.println(getName() + " передвинулся из " + place1 + " в " + place2);// персонаж передвигается из одного места в другое
        } else {
            System.out.println(getName() + " и " + person2 + " передвинулись из " + place1 + " в " + place2);// персонажи передвигаются из одного места в другое
        }
    }

    public void communication(String someWords, Person person2) { //взаимодействие двух персонажецй
        System.out.println(getName() + someWords + person2);
    }

    public void storage(Item item, Place place) {
        if (place == null) {
            System.out.println(getName() + " хранит " + item); //персонаж хранит какую то вещь
        } else {
            System.out.println(getName() + " хранит " + item + " на " + place); //персонаж хранит какую то вещь где-то
        }
    }

    /*public void remind(Person remembered, String prompt) {

        System.out.println(getName() + " напоминла " + remembered + " о " + prompt);
    }
     */

    public void remembering(Person remembered, String notification){
      possiblePrompt.remember(remembered, notification);
    }
    Remembable possiblePrompt = new Remembable() { // анонимный класс
        @Override
        public void remember(Person remembered, String prompt) {
            System.out.println("Если-бы " + getName() + " напомнила " + remembered + " о " + prompt);
        }
    };
    public static void getObjectDescribe(Item item, String name, String describe) {
        System.out.println(item + "  называется " + name + ", " + describe);
    }

    public void compare(String object1, String object2) {
        System.out.println(getName() + " думает, что " + object1 + " не похоже на другие " + object2); //персонаж сравнивает схожесть обьектов
    }

    public void joke(Person person, Person person2) {
        if (person2 == null) {
            System.out.println(getName() + " подшучивает над " + person.getName()); //персонаж подшучивает над одругим персонажем
        } else {
            System.out.println(getName() + " подшучивает над " + person.getName() + " и " + person2.getName()); //персонаж подшучивает над одругими персонажами
        }
    }

    public void frighten(Person person1, Person person2) { //персонаж пугает других персонажей
        System.out.println(getName() + " испугал " + person1 + " и " + person2);
    }

    public void carry(Person person2, Place place1, Place place2) { //персонаж перемещает другого персонажа из одного места в другое
        System.out.println(getName() + " перенес " + person2.getName() + " из " + place1 + " в " + place2);
    }

    public void teach(Person person2, String lesson) { //персонаж учит другого чему то
        System.out.println(getName() + " научил " + person2 + lesson);
    }

    public void complain(Person person2, String causeOfComplain) { //персонаж жалуется другому на что-то
        System.out.println(getName() + " жалуется " + person2.getName() + " что " + causeOfComplain);
    }

    public void takeOff(Item item, String action) { // персонаж снимает что-то и совершает действие
        System.out.println(getName() + " снял  " + item + " и " + action);
    }

    public void allowing(Person person, String action) { //персонаж разрешает что-то
        System.out.println(getName() + " разрешила" + action + person.getName());
    }

    public void notAllowing(Person person, Person person2, String ban, String action, Place place) { // персонаж не разрешает что-то
        if (action == null) {
            System.out.println(getName() + " не разрешает, чтобы " + person.getName() + action + person2.getName() + " на " + place);
        } else if (person2 == null) {
            System.out.println(getName() + ban + person.getName() + action);
        } else {
            System.out.println(getName() + ban + person.getName() + action + person2.getName() + " на " + place);
        }
    }

    public void count(String countableObjects, String objectFeatures, Place place) {
        if (place == null) {
            System.out.println(countableObjects + objectFeatures);
        } else {
            System.out.println(countableObjects + objectFeatures + place);
        }
    }

    public void drink(String beLike) {
        System.out.println(getName() + " пьет" + beLike);
    }



    public void calm(Person person) {
        System.out.println(getName() + " успокаивает " + person);
    }

    public class Propeller { //вложенный класс
        public  void getOwner() {
            System.out.println("У " + getName() + " есть пропеллер");
        }
        public void abilityToFly(Person person){
            if(person.energyLevel == EnergyLevel.MINIMAL){
                System.out.println(person + " не способен даже двигаться, не то что запустить пропеллер...");
            }
            else if (person.energyLevel == EnergyLevel.LOW){
                System.out.println(person + " слишком устал что бы запустить пропеллер!");
            }else if (person.energyLevel == EnergyLevel.MEDIUM){
                System.out.println(person + " стоит еще подкрепиться и отдохнуть!");
            } else if (person.energyLevel == EnergyLevel.HIGH){
                System.out.println(person + " сыт и готов к полету!");
            }else if (person.energyLevel == EnergyLevel.MAXIMAL){
                System.out.println(person + " полон сочиться энергией и готов летать!" );
            }
        }
    }
    public Propeller propeller = new Propeller();


}


