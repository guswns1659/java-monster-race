package monsterRace;

import java.util.Random;

public class Esper implements Monster {
    private String name;
    private int moveCount;

    public Esper(String name) {
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
        return "에스퍼";
    }

    @Override
    public void move(int attempts) {
        for (int count = 0; count < attempts; count++){
            isMove();
        }
    }

    private void isMove() {
        if (random() == 9) move();
    }

    private void move() {
        int moveCount = new Random().nextInt(100) + 1;
        this.moveCount += moveCount;
    }

    private int random() {
        return new Random().nextInt(10);
    }
}
