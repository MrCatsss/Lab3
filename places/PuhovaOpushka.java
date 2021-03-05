package places;

public class PuhovaOpushka extends Place {
    String name = "Пухова Опушка";

    public PuhovaOpushka() {
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }


}
