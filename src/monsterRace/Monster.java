package monsterRace;

public interface Monster {
    void tryForMove(int numberOfTries);
    String getName();
    int getMoveCount();
    String getType();
}
