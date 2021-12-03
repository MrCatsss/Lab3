package places;

public class OpenedAutocar extends Place {
    String name = "открытые автомашины";

    public OpenedAutocar(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
