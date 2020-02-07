package monsterRace;

public interface Monsters {
    void tryForMove(int numberOfTries);
    String getName();
    int getMoveCount();
    String getType();
}
