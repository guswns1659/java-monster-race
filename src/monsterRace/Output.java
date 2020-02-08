package monsterRace;

import java.util.List;

public class Output {
    public void print(List<Monster> monsters, Monster winner) {
        for (Monster each : monsters) {
            printEach(each);
        }
        printWinner(winner);
    }

    private void printWinner(Monster winner) {
        System.out.println("\n승자는 " + winner.name() + "입니다!!");
    }

    private void printEach(Monster each) {
        System.out.printf( "%s [%s] : ",each.name(),each.type());
        for (int count = 0; count < each.moveCount(); count++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
