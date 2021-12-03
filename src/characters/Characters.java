package characters;

import entity.Entity;
import places.Place;

public abstract class Characters implements Entity {
    public Place place;
    public String name;

    public Characters(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        System.out.println("Персонаж " + this.getName() + " сменил место с " +
                this.place + " на " + place);
        this.place = place;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return this.hashCode() == object.hashCode();
    }
}
