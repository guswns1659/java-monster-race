package monsterRace;

import java.util.List;

public class Output {
    public void print(List<Monsters> monsters) {
        for (Monsters each : monsters) {
            printEach(each);
        }
    }

    private void printEach(Monsters each) {
        System.out.print(each.getName() + " ");
        System.out.print("["+ each.getType() + "] : ");
        for (int count = 0; count < each.getMoveCount(); count++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
