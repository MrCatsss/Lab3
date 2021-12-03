package places;

public class FarAway extends Place{
    String name = "издаль";

    public FarAway(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
