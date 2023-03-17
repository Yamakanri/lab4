package Actors;


import Enums.EnergyLevel;
import Exceptions.PersonHasNotNameException;
import Exceptions.PersonIsTooOldException;

public abstract class Marginals extends Person{
    public Marginals(String name, int age, EnergyLevel energyLevel) throws PersonHasNotNameException, PersonIsTooOldException {
        super(name, age, energyLevel);
    }

}
