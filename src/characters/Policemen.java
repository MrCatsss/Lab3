package characters;

import places.Place;

public class Policemen extends Characters {
    String name = "Полицейские";

    public Policemen(Place place, State state) {
        super(place);
        System.out.println("Созданы " + this + " в " + place + " " + state.getState());
    }

    @Override
    public String getName() {
        return name;
    }

    public void crowd_the_crowd(State state, Characters crowd) {
        System.out.println(name + ", " + state.AS_ON_COMMAND.getState() + ", ринулись вперёд и стали теснить " + crowd);
    }
}
