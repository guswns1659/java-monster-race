import java.util.Random;

public class Index {
    public static void main(String[] args) {
        System.out.println((int)(Math.floor(Math.random() * 10)));
        System.out.println(new Random().nextInt(10));
    }
}
