package devices;

import characters.Characters;

public class TV_Cameras extends AllDevices {
    String name = "кинокамеры";
    public TV_Cameras(Characters owners) {
        System.out.println("Созданы " + this.name +
                ", Владельцы: \"" + owners +"\"");
    }
}
