package characters;

import entity.Entity;
import places.Place;

public class ChristopherRobin extends Character {
    String name = "Кристофер Робин";

    public ChristopherRobin(Place place) {
        super(place);
        System.out.println("Создан " + this + " в " + place);
    }

    @Override
    public String getName() {
        return name;
    }

    public void beHappyWithSomeone(Entity entity) {
        System.out.println(this + " обрадовался сущности " + entity);
    }
}
