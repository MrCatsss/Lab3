package places;

import entity.Entity;

public abstract class Place implements Entity {
    @Override
    public String toString() {
        return "место \"" + this.getName() + "\"";
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
