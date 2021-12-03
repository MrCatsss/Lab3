package characters;

import places.Place;

public class Crowd extends Characters {
    String name = "Толпа";

    public Crowd(Place place) {
        super(place);
        System.out.println("Создана " + this + " в " + place);
    }

    @Override
    public String getName() {
        return name;
    }

    public void panic(State state, Place place) {
        System.out.println(name + " " + state.getState());
        this.setPlace(place);
    }
}
