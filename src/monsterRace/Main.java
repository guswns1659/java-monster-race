package monsterRace;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        Input input = new Input();
        user.start(input);

        Game game = new Game(input.attempts(), input.ProfilesOfMonsters());
        game.gameStart();

        Output output = new Output();
        output.print(game.getMonsters(), game.winner());
    }
}
