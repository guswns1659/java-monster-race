package monsterRace;

import java.util.Random;

public class Esper implements Monster {
    private String name;
    private int moveCount;

    public Esper(String name) {
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
        return "에스퍼";
    }

    // 랜덤값이 9인 경우만 1<= x <= 100 만큼 전진
    @Override
    public void tryForMove(int numberOfTries) {
        for (int count = 0; count < numberOfTries; count++){
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
