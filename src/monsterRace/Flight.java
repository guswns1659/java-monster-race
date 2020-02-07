package monsterRace;

import java.util.Random;

public class Flight implements Monster {
    private String name;
    private int moveCount;

    public Flight(String name) {
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
        return "비행";
    }

    @Override
    public void tryForMove(int numberOfTries) {
        for (int count = 0; count < numberOfTries; count++){
            isMove();
        }
    }

    private void isMove() {
        if (random() > 5) move();
    }

    private void move() {
        this.moveCount += 3;
    }

    private int random() {
        return new Random().nextInt(10);
    }
}
