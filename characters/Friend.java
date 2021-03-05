package characters;

import places.Place;

public class Friend extends Character {
    String name;

    public Friend(Place place, String name) {
        super(place);
        this.name = name;
        System.out.println("В " + place +" создан друг: " + this );
    }

    @Override
    public String getName() {
        return name;
    }


}
