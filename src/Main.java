import characters.*;
import devices.*;
import places.*;

import java.util.EventListener;

public class Main {

    public static void main(String[] args) {
        Everyone everyone = new Everyone();
        LobotryasovStreet street = new LobotryasovStreet();
        DunnoAndGang dunno_and_gang = new DunnoAndGang(street);
        everyone.addPerson(dunno_and_gang);
        OppositeTheHotel opposite_hotel = new OppositeTheHotel();
        Crowd crowd = new Crowd(opposite_hotel);
        everyone.addPerson(crowd);
        TV_Spotlights tv_light = new TV_Spotlights(crowd);
        dunno_and_gang.see(crowd);
        OpenedAutocar opencars = new OpenedAutocar();
        SomeFilmAndTvOperators SmOper = new SomeFilmAndTvOperators(opencars);
        everyone.addPerson(SmOper);
        Devices devices = new Devices(SmOper);
        SmOper.preparing(State.FULLY_STAND, devices);
        NearTheEntrance NearEntr = new NearTheEntrance();
        Policemen police = new Policemen(NearEntr, State.READY_TO_USE_BATONS);
        everyone.addPerson(police);
        TV_Cameras TvCam = new TV_Cameras(SmOper);
        FarAway away = new FarAway();
        YellowAutocar YlwAuto = new YellowAutocar(away);
        SmOper.see(YlwAuto);
        SmOper.point(YlwAuto, TvCam, State.STARTED_SHOOTING);
        crowd.setPlace(NearEntr);
        Pavement pvm = new Pavement();
        crowd.panic(State.STARTED_WORRYING, pvm);
        police.crowd_the_crowd(State.AS_ON_COMMAND, crowd);
        Hotel hotel = new Hotel();
        OppositeTheEntrance oppentr = new OppositeTheEntrance();
        everyone.see_car(YlwAuto, hotel, oppentr);
    }
}
