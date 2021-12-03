package places;

public class NearTheEntrance extends Place {
    String name = "возле входа в гостиницу";

    public NearTheEntrance(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
