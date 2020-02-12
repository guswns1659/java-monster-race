package monsterRace;

import java.io.IOException;

public class User {
    public void start(InputView input) throws IOException {
        input.showTitle();
        input.askUser();
    }
}
