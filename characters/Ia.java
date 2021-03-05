package characters;

import places.Place;

public class Ia extends Character {
    String name = "Иа";

    public Ia(Place place) {
        super(place);
    }

    @Override
    public String getName() {
        return name;
    }
}
