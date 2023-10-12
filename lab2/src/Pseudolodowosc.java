import java.util.Random;

public class Pseudolodowosc {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(5445);
        int a = random.nextInt();
        System.out.println(a);
    }
}
