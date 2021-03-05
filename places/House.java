package places;

public class House extends Place {
    String name = "Дом";

    public House(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }


}
