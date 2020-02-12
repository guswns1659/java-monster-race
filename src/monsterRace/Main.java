package monsterRace;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User();
        InputView inputView = new InputView();
        user.start(inputView);

        Game game = new Game(inputView.attempts(), inputView.ProfilesOfMonsters());
        game.gameStart();

        Output output = new Output();
        output.print(game.getMonsters(), game.winner());
    }
}
