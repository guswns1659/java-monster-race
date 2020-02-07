package monsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Game {
    private List<Monster> monsters;
    private List<String[]> profilesOfMonsters;
    private Monster winner;
    private int numberOfMonster;
    private int numberOfTries;

    private MonsterConstructor monsterConstructor;

    public Game(int numberOfMonster, int numberOfTries,
                List<String[]> profilesOfMonsters) {
        this.numberOfMonster = numberOfMonster;
        this.numberOfTries = numberOfTries;
        this.profilesOfMonsters = profilesOfMonsters;
        monsters = new ArrayList<>();
        monsterConstructor = new MonsterConstructor();
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void gameStart() {
       this.monsters = monsterConstructor.createAll(this.profilesOfMonsters);
       for (Monster each : this.monsters) {
           each.tryForMove(numberOfTries);
       }
       setWinner();
    }

    public Monster winner() {
        return this.winner;
    }

    private void setWinner() {
        List<Integer> moveCounts = new ArrayList<>();
        for (Monster each : this.monsters) {
            moveCounts.add(each.getMoveCount());
        }
        OptionalInt max = moveCounts.stream()
                .mapToInt(i -> i)
                .max();

        for (Monster each : this.monsters) {
            if (max.getAsInt() == each.getMoveCount()) {
                this.winner = each;
            }
        }
    }

}
