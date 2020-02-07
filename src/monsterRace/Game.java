package monsterRace;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Monster> monsters;
    private int numberOfMonster;
    private int numberOfTries;

    public Game(int numberOfMonster, int numberOfTries) {
        this.numberOfMonster = numberOfMonster;
        this.numberOfTries = numberOfTries;
        monsters = new ArrayList<>();

        int monsterName = 0;
        for (int count = 0; count < numberOfMonster; count++){
            monsterName++;
            monsters.add(new Monster(monsterName));
        }
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void gameStart() {
        for (Monster each : this.monsters) {
            each.tryForMove(this.numberOfTries);
        }
    }
}
