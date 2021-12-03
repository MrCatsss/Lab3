package devices;

import characters.Characters;

public class TV_Spotlights extends AllDevices {
    String name = "кинопрожекторы";
    public TV_Spotlights(Characters victims) {
        System.out.println("Созданы " + this.name +
                ", освещающие \"" + victims +"\"");
    }
}
