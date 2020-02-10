package monsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

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
        this.monsters.forEach(each -> each.move(this.attempts));
    }

    private void setWinner() {
        List<Integer> moveCounts = new ArrayList<>();
        this.monsters
                .forEach(each -> moveCounts.add(each.moveCount()));

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
