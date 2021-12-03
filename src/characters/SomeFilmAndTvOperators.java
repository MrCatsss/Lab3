package characters;

import devices.AllDevices;
import devices.Devices;
import places.Place;

public class SomeFilmAndTvOperators extends Characters {
    String name = "Несколько кинооператоров и телеоператоров";


    public SomeFilmAndTvOperators(Place place) {
        super(place);
        System.out.println("Созданы " + this.name + " в " + place);
    }

    @Override
    public String getName() {
        return name;
    }

    public void preparing(State state, AllDevices devices) {
        System.out.println(this.name + " " + state.getState() + " в \"" + this.place.getName() + "\" и прицеливают \""
                + devices + "\" в разные стороны, готовясь к съёмке и телепередаче");
    }

    public void see(Characters character) {
        System.out.println(this.name + " завидели издали приближающийся \"" + character.getName() + "\"");
    }

    public void point(Characters car, AllDevices devices, State state) {
        System.out.println(this + " направили на " + car + " свои " + devices + " и " + state.getState());
    }

}
