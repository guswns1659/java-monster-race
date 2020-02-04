import java.util.*;

public class Game {
    private int numberOfMonsters;
    private int numberOfTries;
    private List<Monster> monsters;

    public Game(int numberOfMonsters, int numberOfTries) {
        this.numberOfMonsters = numberOfMonsters;
        this.numberOfTries = numberOfTries;

        monsters = new ArrayList<>();
        for (int count = 0; count < this.numberOfMonsters; count++) {
            monsters.add(new Monster(count));
        }
    }

    public int getNumberOfMonsters() {
        return numberOfMonsters;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void gameStart() {

    }
}
