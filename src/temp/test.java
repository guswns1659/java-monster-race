package temp;

import java.io.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        fileWriterTest();
//        readFile();
        bufferedOutputStreamTest();
    }

    private static void bufferedOutputStreamTest() {
        try (BufferedWriter bo =
                     new BufferedWriter(new FileWriter("count.txt"))) {
            bo.write(String.valueOf(7));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("profiles.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.replaceAll(" ", "").split("/")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileWriterTest() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("profiles.txt"))) {
            System.out.print("몬스터 숫자는?");
            bw.write(br.readLine() + "/");
            System.out.print("이름과 종류");
            bw.write(br.readLine() + "/");
            System.out.print("시도횟수");
            bw.write(br.readLine() + "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
