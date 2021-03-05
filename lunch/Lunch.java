package lunch;

import characters.Character;
import entity.Entity;

public class Lunch implements Entity {
    String name = "обед";
    LunchTypes type;
    Character  owner;

    public Lunch(LunchTypes type, Character owner) {
        this.owner = owner;
        this.type = type;
        System.out.println("Создан " + name + " типа: \"" +
                type.getType() + "\", владелец: \"" + owner +"\"");
    }

    @Override
    public String getName() {
        return name;
    }

    public LunchTypes getType() {
        return type;
    }

    public Character getOwner() {
        return owner;
    }

    @Override
    public String toString() {
//        return name + ", типа: \"" + type.getType() + "\'";
        return name + ", " + type.getType();
    }
}
