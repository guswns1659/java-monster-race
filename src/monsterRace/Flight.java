package monsterRace;

import java.util.Random;

public class Flight implements Monsters {
    private String name;
    private int moveCount;
    private String type = "비행";

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
        return type;
    }


    // 랜덤값이 6이상인 경우 3칸 이동
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
