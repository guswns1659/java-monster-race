public class Monster {
    private int moveCount;
    private int number;

    public Monster(int number) {
        this.number = number;
    }

    public void move(){
        this.moveCount++;
    }
}
