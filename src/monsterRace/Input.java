package monsterRace;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private int NumberOfMonster;
    private int NumberOfTries;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public int getNumberOfMonster() {
        return NumberOfMonster;
    }

    public int getNumberOfTries() {
        return NumberOfTries;
    }

    public void showTitle() {
        System.out.println("스릴 만점 건전한 몬스터 경주");
    }

    public void askUser() {
        askNumberOfMonster();
        askNumberOfTries();
    }

    private void askNumberOfMonster() {
        System.out.println("몬스터는 모두 몇 마리인가요?");
        this.NumberOfMonster = scanner.nextInt();
    }

    private void askNumberOfTries() {
        System.out.println("시도할 횟수는 몇 회인가요??");
        this.NumberOfTries = scanner.nextInt();
    }
}
