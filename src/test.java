import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        testReadline();
        try {
            testBufferedReader();
        } catch (Exception e) {
            System.out.println("올바른 입력을 해주세요!");
        }
    }

    private static void testBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.println("입력해주세요.");
            System.out.println(br.readLine().replaceAll(" ", ""));
        }
    }

    private static void testReadline() {
        Scanner scanner = new Scanner(System.in);
        String line;
        for (int i = 0; i < 3; i++) {
            line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
