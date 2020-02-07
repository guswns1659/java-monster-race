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
        System.out.println("승자는 " + winner.getName() + " 입니다!!");
    }

    private void printEach(Monster each) {
        System.out.print(each.getName() + " ");
        System.out.print("["+ each.getType() + "] : ");
        for (int count = 0; count < each.getMoveCount(); count++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
