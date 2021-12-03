package devices;

import entity.Entity;
import characters.Characters;

public class Devices extends AllDevices {
    String name = "аппараты";
    Characters group;

    public Devices(Characters owners) {
        this.group = owners;
        System.out.println("Создан " + name +
                ", владелец: \"" + group +"\"");
    }

    @Override
    public String getName() {
        return name;
    }
}
