package monsterRace;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Monsters> monsters;
    private int numberOfMonster;
    private int numberOfTries;
    private List<String[]> profilesOfMonsters;

    private MonsterConstructor monsterConstructor;

    public Game(int numberOfMonster, int numberOfTries,
                List<String[]> profilesOfMonsters) {
        this.numberOfMonster = numberOfMonster;
        this.numberOfTries = numberOfTries;
        this.profilesOfMonsters = profilesOfMonsters;

        monsters = new ArrayList<>();

        monsterConstructor = new MonsterConstructor();
    }

    public List<Monsters> getMonsters() {
        return monsters;
    }

    public void gameStart() {
       this.monsters = monsterConstructor.createAll(this.profilesOfMonsters);
       for ( Monsters each : this.monsters) {
           System.out.println(each);
       }
//        for (Monster each : this.monsters) {
//            each.tryForMove(this.numberOfTries);
//        }
    }
}
