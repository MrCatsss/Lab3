package characters;

import entity.Entity;
import places.Place;

import java.util.ArrayList;

public class Everyone implements Entity {
    ArrayList everyone = new ArrayList();
    String name = "Все";

    @Override
    public String toString() {
        String names = "";
        for (Object person : everyone) {
            names += "\"" + ((Characters) person).getName() + "\" ";
        }
        return "Все: " + names;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addPerson(Characters person) {
        everyone.add(person);
    }

    public void see_car(YellowAutocar car, Place place1, Place place2) {
        System.out.print("Все видели, как ");
        car.drive_smoothly(place1);
        car.stop(place2);
    }


}
