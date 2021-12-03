package places;

public class YellowCar extends Place {
    String name = "Жёлтый автомобиль";

    public YellowCar(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
