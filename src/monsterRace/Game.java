package monsterRace;

import java.util.*;

public class Game {
    private List<Monster> monsters;
    private Monster winner;
    private int attempts;
    private MonsterConstructor monsterConstructor;

    public Game(int attempts, List<String[]> profilesOfMonsters) {
        this.attempts = attempts;
        monsters = new ArrayList<>();
        monsterConstructor = new MonsterConstructor();
        generateMonsters(profilesOfMonsters);
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void gameStart() {
        racing();
        setWinner();
    }

    public Monster winner() {
        return this.winner;
    }

    private void generateMonsters(List<String[]> profilesOfMonsters) {
        this.monsters = monsterConstructor.createAll(profilesOfMonsters);
    }

    private void racing() {
        for (Monster each : this.monsters) {
            each.move(this.attempts);
        }
    }

    private void setWinner() {
        List<Integer> moveCounts = new ArrayList<>();
        for (Monster each : this.monsters) {
            moveCounts.add(each.moveCount());
        }
        OptionalInt max = moveCounts.stream()
                .mapToInt(i -> i)
                .max();
        for (Monster each : this.monsters) {
            if (max.getAsInt() == each.moveCount()) {
                this.winner = each;
            }
        }
    }

}
