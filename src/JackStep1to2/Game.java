package JackStep1to2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Monster> monsters;
    private int numberOfMonster;
    private int numberOfTries;

    public Game(int numberOfMonster, int numberOfTries) {
        this.numberOfMonster = numberOfMonster;
        this.numberOfTries = numberOfTries;
        monsters = new ArrayList<>();

        for (int count = 1; count <= numberOfMonster; count++){
            monsters.add(new Monster(count));
        }
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public int getNumberOfMonster() {
        return numberOfMonster;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void gameStart() {
        for (Monster each : this.monsters) {
            tryForMove(each);
        }
    }

    private void tryForMove(Monster each) {
        for (int count = 0; count < this.numberOfTries; count++) {
            isMove(each);
        }
    }

    private void isMove(Monster each) {
        int random = getRandom();
        if (random > 3) each.move();
    }

    private int getRandom() {
        return new Random().nextInt(10);
    }
}
