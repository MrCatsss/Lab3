package devices;

import characters.Characters;
import entity.Entity;

public abstract class AllDevices implements Entity {
    String name = "аппараты";
    Characters group;

    @Override
    public String getName() {
        return name;
    }

    public Characters getOwners() {
        return group;
    }

    @Override
    public String toString() {
        return name;
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

