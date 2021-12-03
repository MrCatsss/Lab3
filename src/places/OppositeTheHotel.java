package places;

public class OppositeTheHotel extends Place {
    String name = "напротив здания гостиницы";

    public OppositeTheHotel(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
