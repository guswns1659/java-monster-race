package monsterRace;

import java.util.List;

public class Show {

    public void showMonsters(List<String[]> profilesOfMonsters) {
        for (String[] profile : profilesOfMonsters) {
            showEach(profile);
        }
    }

    private void showEach(String[] profile) {
        System.out.printf("이름 : %s, 타입 : %s", profile[0], profile[1]);
        System.out.println();
    }
}
