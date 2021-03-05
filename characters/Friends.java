package characters;

import entity.Entity;
import lunch.Lunch;
import places.Place;

import java.util.ArrayList;

public class Friends implements Entity {
    ArrayList friends = new ArrayList();
    String name = "Друзья";

    @Override
    public String toString() {
        String names = "";
        for (Object friend : friends) {
            names += "\"" + ((Friend) friend).getName() + "\" ";
        }
        return "Друзья: " + names;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addFriend(Friend friend) {
        friends.add(friend);
    }

    public void almostHaveALunch(Lunch lunch) {
        System.out.println(name + " почти пообедали, то есть съели " + lunch);
    }

    public void hurryToAnotherPlace(Place place, String reason) {
        System.out.println(name + " поспешили на " + place + ", чтобы " + reason);
    }

    public String visitSomebody(Character character) {
        return "навестить " + character;
    }

    public String dontBeLateForLunch(Lunch lunch) {
        return "неопоздать на " + lunch.getName() + ", типа: \"" + lunch.getType().getType() + "\" у " + "\"" + lunch.getOwner() + "\"";
    }
}
