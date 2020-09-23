import java.util.Scanner;

public class Basic1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int i = 0;

        while (i < a) {
            b = sc.nextInt();
            System.out.println(b);
            i++;
        }
    }
}
