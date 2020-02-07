package monsterRace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Input {
    private BufferedReader bufferedReader;
    private int NumberOfMonster;
    private int NumberOfTries;
    private List<String[]> profilesOfMonsters;
    private Parser parser;

    public Input() {
        bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        profilesOfMonsters = new ArrayList<>();
        parser = new Parser();
    }

    public int getNumberOfMonster() {
        return NumberOfMonster;
    }

    public int getNumberOfTries() {
        return NumberOfTries;
    }

    public List<String[]> getProfilesOfMonsters() {
        return profilesOfMonsters;
    }

    public void showTitle() {
        System.out.println("신나는 몬스터 레이스");
    }

    public void askUser() throws IOException {
        askNumberOfMonster();
        askProfileOfMonster();
        askNumberOfTries();
    }

    private void askNumberOfMonster() {
        System.out.println("몇 명의 몬스터가 경주하나요?");
        try {
            this.NumberOfMonster = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e){
            System.out.println("올바른 양수를 입력해주세요.");
            askNumberOfMonster();
        }
    }

    private void askProfileOfMonster() throws IOException {
        System.out.println("경주할 몬스터의 이름과 종류를 입력하세요. (쉼표를 기준으로 구분)");
        for (int count = 0; count < this.NumberOfMonster; count++) {
            String[] profile = parser.parse(bufferedReader.readLine());
            this.profilesOfMonsters.add(profile);
        }
    }

    private void askNumberOfTries() {
        System.out.println("시도할 횟수는 몇 회인가요??");
        try {
            this.NumberOfTries = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("올바른 양수를 입력해주세요.");
            askNumberOfTries();
        }
    }
}
