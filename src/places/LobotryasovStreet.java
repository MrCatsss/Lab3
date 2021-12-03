package places;

public class LobotryasovStreet extends Place {
    String name = "улица Лоботрясов";

    public LobotryasovStreet(){
        System.out.println("Создано " + this);
    }

    @Override
    public String getName() {
        return name;
    }
}
