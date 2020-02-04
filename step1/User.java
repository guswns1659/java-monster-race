public class User {

    public void start(Input input) {
        input.showTitle();
        input.askNumberOfMonsters();
        input.askNumberOfTries();

        Game game = new Game(input.getNumberOfMonsters(), input.getNumberOfTries());
        game.gameStart();
    }
}
