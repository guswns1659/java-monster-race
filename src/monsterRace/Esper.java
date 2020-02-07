package monsterRace;

public class Esper implements Monsters {
    private String name;

    public Esper(String name) {
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
