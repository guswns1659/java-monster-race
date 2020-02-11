package monsterRace;

import java.util.Random;

public class Esper extends Monster {
    private static final String TYPE = "에스퍼";

    public Esper(String name) {
        super(name);
    }

    @Override
    public String type() {
        return TYPE;
    }

    @Override
    protected void tryMove() {
        if (random() == 9) move();
    }

    @Override
    protected void move() {
        this.moveCount += new Random().nextInt(100) + 1;
    }
}
