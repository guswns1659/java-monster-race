public class User {
    public void start() {
        Input input = new Input();
        input.showTitle();
        input.askUser();

        Game game = new Game(input.getNumberOfMonster(), input.getNumberOfTries());
        game.gameStart();

    }
}
