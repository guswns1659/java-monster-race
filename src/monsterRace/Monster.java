package monsterRace;

import java.util.Random;

public class Monster {
    private int name;
    private int moveCount;

    public Monster(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }


    public void tryForMove(int numberOfTries) {
        for (int count = 0; count < numberOfTries; count++) {
            isMove();
        }
    }

    private void isMove() {
        if (random() > 3) move();
    }

    private int random() {
        return new Random().nextInt(10);
    }

    private void move() {
        this.moveCount++;
    }
}
