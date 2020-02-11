package monsterRace;

public class Runner extends Monster {
    private static final String TYPE = "달리기";

    public Runner(String name) {
        super(name);
    }

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    protected void tryMove() {
        if (random() > 3) move();
    }

    @Override
    protected void move() {
        this.moveCount++;
    }
}
