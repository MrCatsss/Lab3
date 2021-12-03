package characters;

public enum State {
    FULLY_STAND("стоят во весь рост"),
    READY_TO_USE_BATONS("готовые, в случае надобности, пустить в ход резиновые дубинки"),
    STARTED_SHOOTING("стали снимать"),
    STARTED_WORRYING("заволновалась"),
    AS_ON_COMMAND("как по команде");

    String state;
    State(String state) { this.state = state; }

    public String getState() {
        return state;
    }
}
