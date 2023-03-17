package Actors;

import Enums.EmotionalCondition;
import Enums.EnergyLevel;
import Exceptions.PersonHasNotNameException;
import static Exceptions.PersonIsTooOldException.*;

import Exceptions.PersonIsTooOldException;
import Interfaces.Movementable;

public abstract class Person implements Movementable{
    private String name;
    int age;
    EnergyLevel energyLevel;
    int calories;
    public boolean hasName;




    public Person (String name, int age, EnergyLevel energyLevel) throws PersonHasNotNameException, PersonIsTooOldException {
        this.name =name;
        if (name != null) {hasName = true;};
        if (hasName) {
            System.out.println("\t\t В истории появляется персонаж " + getName());
        } else {
            throw new PersonHasNotNameException("У персонажа нет имени!!");
        }
        this.age = age;

        try {
            ageCheck(age);
        } catch (PersonIsTooOldException e) {
            System.out.println(e.getMessage());
        }
        this.energyLevel = energyLevel;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }


    public void emotion(EmotionalCondition emotionalCondition) {

        if (emotionalCondition != EmotionalCondition.CALM)
            System.out.println(getName() + " чувствует: " + emotionalCondition);
        else
            System.out.println(getName()+ emotionalCondition);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
