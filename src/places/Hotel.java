package places;

public class Hotel extends  Place{
    String name = "гостиница";

    public Hotel(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
