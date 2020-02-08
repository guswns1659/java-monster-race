package monsterRace;

import java.io.*;
import java.util.*;

public class Input {
    private BufferedReader bufferedReader;
    private List<String[]> profilesOfMonsters;
    private int NumberOfMonster;
    private int attempts;
    private Parser parser;

    public Input() {
        bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        profilesOfMonsters = new ArrayList<>();
        parser = new Parser();
    }

    public List<String[]> ProfilesOfMonsters() {
        return profilesOfMonsters;
    }

    public int attempts() {
        return attempts;
    }

    public void showTitle() {
        System.out.println("신나는 몬스터 레이스");
    }

    public void askUser() throws IOException {
        askNumberOfMonster();
        askProfileOfMonster();
        askAttempts();
    }

    private void askNumberOfMonster() {
        System.out.println("몇 명의 몬스터가 경주하나요?");
        try {
            this.NumberOfMonster = Integer.parseInt(bufferedReader.readLine());
            if (this.NumberOfMonster < 0) throw new Exception();
        } catch (Exception e){
            System.out.println("1 이상 양수를 입력해주세요.");
            askNumberOfMonster();
        }
    }

    private void askProfileOfMonster() throws IOException {
        System.out.println("경주할 몬스터의 이름과 종류를 입력하세요. ex) 크롱, 달리기");
        System.out.println("몬스터 종류 : 달리기, 비행, 에스퍼");
        for (int count = 0; count < this.NumberOfMonster; count++) {
            String[] profile = parser.parse(bufferedReader.readLine());
            this.profilesOfMonsters.add(profile);
        }
    }

    private void askAttempts() {
        System.out.println("시도할 횟수는 몇 회인가요??");
        try {
            this.attempts = Integer.parseInt(bufferedReader.readLine());
            if (this.attempts < 0) throw new Exception();
        } catch (Exception e) {
            System.out.println("1 이상 양수를 입력해주세요.");
            askAttempts();
        }
    }
}
