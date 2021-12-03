package characters;

import places.Place;

public class YellowAutocar extends Characters {
    String name = "Жёлтая автомашина";

    public YellowAutocar(Place place) {
        super(place);
        System.out.println("Создана " + this + " в " + place);
    }

    @Override
    public String getName() {
        return name;
    }

    public void drive_smoothly(Place place) {
        System.out.print(this + " плавно подъехала к " + place);
    }

    public void stop(Place place) {
        System.out.println(" и остановилась " + place.getName());
    }
}
