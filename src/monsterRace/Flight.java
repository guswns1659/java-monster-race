package monsterRace;

public class Flight implements Monsters {
    private String name;

    public Flight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getMoveCount() {
        return 0;
    }

    @Override
    public void tryForMove() {

    }
}
