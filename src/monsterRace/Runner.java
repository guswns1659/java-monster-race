package monsterRace;

public class Runner implements Monsters {
    private String name;

    public Runner(String name) {
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
