package monsterRace;

public interface Monster {
    void move(int attempts);
    String name();
    String type();
    int moveCount();
}
