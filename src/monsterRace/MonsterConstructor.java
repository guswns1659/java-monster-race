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
        if (isRunner(type)) {
            return new Runner(name);
        } else if (isFlight(type)) {
            return new Flight(name);
        } else if (isEsper(type))
            return new Esper(name);
        return null;
    }

    private boolean isEsper(String type) {
        return type.equals("에스퍼");
    }

    private boolean isFlight(String type) {
        return type.equals("비행");
    }

    private boolean isRunner(String type) {
        return type.equals("달리기");
    }
}
