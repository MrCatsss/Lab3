package places;

public class OppositeTheEntrance extends Place {
    String name = "напротив входа";

    public OppositeTheEntrance(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
