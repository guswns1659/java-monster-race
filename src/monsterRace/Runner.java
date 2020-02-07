package monsterRace;

import java.util.Random;

public class Runner implements Monster {
    private String name;
    private int moveCount;

    public Runner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public String getType() {
        return "달리기";
    }

    @Override
    public void tryForMove(int numberOfTries) {
        for (int count = 0; count < numberOfTries; count++){
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
