package places;

public class Pavement extends Place {
    String name = "мостовая";

    public Pavement(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
