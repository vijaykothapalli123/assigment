import java.util.Random;

public class random {
    public static void main(String[] args) {
        int d;
        Random s = new Random();

        for (d = 1; d<= 50; d++) {
            System.out.println(s.nextInt(100));
        }
    }
}

