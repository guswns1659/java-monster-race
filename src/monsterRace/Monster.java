package monsterRace;

import java.util.Random;

public abstract class Monster {
    private String name;
    protected int moveCount;

    public Monster(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public int moveCount() {
        return moveCount;
    }

    public void move(int attempts) {
        for (int count = 0; count < attempts; count++) {
            tryMove();
        }
    }

    protected int random() {
        return new Random().nextInt(10);
    }

    protected abstract String type();

    protected abstract void tryMove();

    protected abstract void move();
}
