public class Monster {
    private int name;
    private int moveCount;

    public Monster(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move() {
        this.moveCount++;
    }
}
