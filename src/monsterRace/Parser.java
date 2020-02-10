package monsterRace;

public class Parser {
    public String[] parse(String line) {
        return line.replaceAll(" ", "").split(",");
    }
}
