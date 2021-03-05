package characters;

import places.Place;

public class Owl extends Character{
    String name = "Сова";

    public Owl(Place place) {
        super(place);
    }

    @Override
    public String getName() {
        return name;
    }
}
