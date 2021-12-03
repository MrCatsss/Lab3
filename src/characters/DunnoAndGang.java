package characters;

import places.Place;

public class DunnoAndGang extends Characters{
    String name = "Незнайка и его спутники";

    public DunnoAndGang(Place place) {
        super(place);
        System.out.println("Созданы " + this + " в " + place);
    }

    @Override
    public String getName() {
        return name;
    }

    public void see(Characters characters) {
        System.out.println(name + " увидели " + characters + " " + characters.getPlace().getName());
    }
}
