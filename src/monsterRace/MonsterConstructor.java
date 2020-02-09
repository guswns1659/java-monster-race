package monsterRace;

import java.util.ArrayList;
import java.util.List;

public class MonsterConstructor {

    public List<Monster> createAll(List<String[]> profilesOfMonsters) {
        List<Monster> monsters = new ArrayList<>();
        for (String[] profile : profilesOfMonsters) {
            Monster monster = create(profile);
            monsters.add(monster);
        }
        return monsters;
    }

    private Monster create(String[] profile) {
        String name = profile[0];
        String type = profile[1];
        switch (type) {
            case "달리기":
                return new Runner(name);
            case "비행":
                return new Flight(name);
            case "에스퍼":
                return new Esper(name);
        }
        return null;
    }
}
