package monsterRace;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Game {
    private List<Monster> monsters;
    private Monster winner;
    private int attempts;
    private MonsterFactory monsterConstructor;

    public Game(int attempts, List<String[]> profilesOfMonsters) {
        this.attempts = attempts;
        monsters = new ArrayList<>();
        monsterConstructor = new MonsterFactory();
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
        OptionalInt max = this.monsters.stream()
                .mapToInt(Monster::moveCount)
                .max();
        for (Monster each : this.monsters) {
            if (max.orElse(0) == each.moveCount()) {
                this.winner = each;
            }
        }
    }
}
