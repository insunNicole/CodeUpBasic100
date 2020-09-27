import java.util.Scanner;

public class Basic1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();

        for (int i = 1; i <= game; i++) {
            if (i % 3 == 0) {
                System.out.println("X");
            } else {
                System.out.println(i);
            }
        }
    }
}
