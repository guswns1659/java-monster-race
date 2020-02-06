package JackStep1to2;

import java.util.List;

public class Output {
    public void print(List<Monster> monsters) {
        for (Monster each : monsters) {
            printEach(each);
        }
    }

    private void printEach(Monster each) {
        System.out.print(each.getName() + "번 몬스터 : ");
        for (int count = 0; count < each.getMoveCount(); count++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
