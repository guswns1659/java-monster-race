package monsterRace;

import java.io.IOException;

public class User {
    public void start() throws IOException {
        Input input = new Input();
        input.showTitle();
        input.askUser();

        Game game = new Game(input.getNumberOfMonster(), input.getNumberOfTries());
        game.gameStart();

        Output output = new Output();
        output.print(game.getMonsters());

    }
}
