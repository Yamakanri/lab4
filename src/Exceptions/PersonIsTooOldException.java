package Exceptions;

import java.io.IOException;

public class PersonIsTooOldException extends RuntimeException {
    public PersonIsTooOldException(){
        super("Ошибка возраста: Персонаж уже должен быть мертв!");
    }
    public static void ageCheck(int age) throws PersonIsTooOldException {
        if(age>100) throw new PersonIsTooOldException();
    }
}