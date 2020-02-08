package monsterRace;

import java.util.Random;

public class Runner implements Monster {
    private String name;
    private int moveCount;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
    @Override
    public int moveCount() {
        return moveCount;
    }

    @Override
    public String type() {
        return "달리기";
    }

    @Override
    public void move(int attempts) {
        for (int count = 0; count < attempts; count++){
            isMove();
        }
    }

    private void isMove() {
        if (random() > 3) move();
    }

    private void move() {
        this.moveCount++;
    }

    private int random() {
        return new Random().nextInt(10);
    }
}
