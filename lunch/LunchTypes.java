package lunch;

public enum LunchTypes {
    THE_REAL_ONE("Настоящий"),
    ONE_YOU_CAN_FORGET("о котором можно забыть");

    String type;
    LunchTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
