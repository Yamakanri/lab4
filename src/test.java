/*package person;

import food.Food;
import interfaces.Doable;
import interfaces.Sleepable;
import interfaces.Eatable;

import java.util.Objects;

public class Human implements Doable, Sleepable, Eatable {
    private final String name;
    private float weight;x

    private final Role role;


    public Human(String name, float weight, Role role) {
        this.name = name;
        this.weight = weight;
        this.role = role;
    }

    public String printRole() {
        switch (role) {
            case CAPTAIN -> {
                return "Капитан";
            }
            case CITIZEN -> {
                return "Гражданин";
            }
            case POLICEMAN -> {
                return "Полицейский";

            }
            case BANDIT -> {
                return "Бандит";
            }

            default -> {
                return "Неизвестено";
            }
        }

    }

    @Override
    public void toDo(String action, String target) {
        System.out.println(getName() + action + target);
    }

    @Override
    public void eat(String action, Food food) {
        weight = weight + food.getCalories() / 750f;
        System.out.print(action + food.getFoodType());
    }

    @Override
    public void sleep(String action, boolean snore) {
        System.out.print(getName() + action);
        snore = true;
        System.out.println(" и захрапел");
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), role);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Float.compare(human.weight, weight) == 0 && Objects.equals(name, human.name) && role == human.role;
    }
}

*/