package monsterRace;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private BufferedReader bufferedReader;
    private List<String[]> profilesOfMonsters;
    private int numberOfMonster;
    private int attempts;
    private Show show;

    private Parser parser;

    public InputView() {
        profilesOfMonsters = new ArrayList<>();
        show = new Show();
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
        ready();
        askMenu();
        close();
    }

    private void askInformationMenu() throws IOException {
        System.out.println("<몬스터 정보 메뉴>");
        System.out.println("1. 전체 몬스터 정보 보기");
        System.out.println("2. 몬스터 정보 수정");
        System.out.println("3. 새로운 몬스터 정보 입력");
        System.out.println("4. 몬스터 정보 삭제");
        System.out.println("5. 이전 메뉴로");
        System.out.println("원하는 메뉴를 선택해 주세요 (1 ~ 5)");
        int choice = Integer.parseInt(this.bufferedReader.readLine());
        execute(choice);
    }

    private void execute(int choice) throws IOException {
        switch (choice) {
            case 1:
                show.showMonsters(this.profilesOfMonsters);
                askInformationMenu();
                break;
            case 2:
                askProfileOfMonster();
                askInformationMenu();
                break;
            case 3:
                askProfile();
                askInformationMenu();
                break;
            case 4:
                initialize();
                break;
            case 5:
                askUser();
                break;
        }
    }

    private void initialize() throws IOException {
        new FileWriter("count.txt", false).close();
        new FileWriter("profiles.txt", false).close();
        new FileWriter("attempts.txt", false).close();
        this.profilesOfMonsters = new ArrayList<>();
        this.attempts = 0;
        this.numberOfMonster = 0;
    }

    private void askProfile() throws IOException {
        ready();
        askNumberOfMonster();
        askProfileOfMonster();
        askAttempts();
    }

    private void askMenu() throws IOException {
        System.out.println("1. 몬스터 정보");
        System.out.println("2. 게임 시작");
        System.out.println("원하는 메뉴를 선택해 주세요(1 or 2)");
        int choice = Integer.parseInt(this.bufferedReader.readLine());
        if (choice == 1) askInformationMenu();
    }

    private void ready() {
        this.bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
    }

    private void askNumberOfMonster() {
        System.out.println("몇 명의 몬스터가 경주하나요?");
        try {
            this.numberOfMonster = Integer.parseInt(bufferedReader.readLine());
            if (this.numberOfMonster < 1) throw new Exception();
            numberOfWriter(this.numberOfMonster);
        } catch (Exception e) {
            System.out.println("1 이상 양수를 입력해주세요.");
            askNumberOfMonster();
        }
    }

    private void askProfileOfMonster() throws IOException {
        System.out.println("경주할 몬스터의 이름과 종류를 입력하세요. ex) 크롱, 달리기");
        System.out.println("몬스터 종류 : 달리기, 비행, 에스퍼");
        for (int count = 0; count < this.numberOfMonster; count++) {
            String[] profile = parser.parse(bufferedReader.readLine());
            this.profilesOfMonsters.add(profile);
            profilesWriter(profile);
        }
    }

    private void askAttempts() {
        System.out.println("시도할 횟수는 몇 회인가요??");
        try {
            this.attempts = Integer.parseInt(bufferedReader.readLine());
            if (this.attempts < 1) throw new Exception();
            attemptsWriter(this.attempts);
        } catch (Exception e) {
            System.out.println("1 이상 양수를 입력해주세요.");
            askAttempts();
        }
    }

    private void close() throws IOException {
        this.bufferedReader.close();
    }

    private void numberOfWriter(int countOfMonster) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt", true))) {
            bw.write(String.valueOf(countOfMonster));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void profilesWriter(String[] profiles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("profiles.txt", true))) {
            bw.write(Arrays.toString(profiles) + "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void attemptsWriter(int attempts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("attempts.txt", true))) {
            bw.write(String.valueOf(attempts));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
