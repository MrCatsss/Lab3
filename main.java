import characters.*;
import lunch.Lunch;
import lunch.LunchTypes;
import places.House;
import places.PuhovaOpushka;

public class main {
    public static void main(String[] args) {
        House house = new House();
        ChristopherRobin christopherRobin = new ChristopherRobin(house);
        Friends friends = new Friends();
        friends.addFriend(new Friend(house, "Друг 1"));
        friends.addFriend(new Friend(house, "Ру"));
        friends.addFriend(new Friend(house, "Друг 3"));
        christopherRobin.beHappyWithSomeone(friends);
        Lunch lunch1 = new Lunch(LunchTypes.ONE_YOU_CAN_FORGET, christopherRobin);
        friends.almostHaveALunch(lunch1);
        PuhovaOpushka puhovaOpushka = new PuhovaOpushka();
        Owl owl = new Owl(puhovaOpushka);
        Ia ia = new Ia(puhovaOpushka);
        Lunch lunch2 = new Lunch(LunchTypes.THE_REAL_ONE, owl);
        String reason1 = friends.visitSomebody(ia);
        String reason2 = friends.dontBeLateForLunch(lunch2);
        friends.hurryToAnotherPlace(puhovaOpushka, reason1 + " "+ reason2);

    }
}
