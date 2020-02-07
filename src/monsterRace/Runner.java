package monsterRace;

import java.util.Random;

public class Runner implements Monsters {
    private String name;
    private int moveCount;
    private String type = "달리기";

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
        return type;
    }

    // 랜덤 값이 4이상인 경우 1칸 이동
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
