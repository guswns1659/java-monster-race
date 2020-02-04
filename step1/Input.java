import java.util.Scanner;

public class Input {
    private int NumberOfMonsters;
    private int NumberOfTries;
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public int getNumberOfMonsters() {
        return NumberOfMonsters;
    }

    public int getNumberOfTries() {
        return NumberOfTries;
    }


    public void showTitle() {
        System.out.println("스릴 만점 건전한 몬스터 경주!!");
    }


    public void askNumberOfMonsters() {
        System.out.println("몬스터는 모두 몇 마리 인가요??");
        this.NumberOfMonsters = scanner.nextInt();
    }

    public void askNumberOfTries() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        this.NumberOfTries = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Input{" +
                "NumberOfMonsters=" + NumberOfMonsters +
                ", NumberOfTries=" + NumberOfTries +
                '}';
    }
}
