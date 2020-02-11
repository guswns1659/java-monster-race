package monsterRace;

public class Flight extends Monster {
    private static final String TYPE = "비행";

    public Flight(String name) {
        super(name);
    }

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    protected void tryMove() {
        if (random() > 5) move();
    }

    @Override
    protected void move() {
        this.moveCount += 3;
    }
}
