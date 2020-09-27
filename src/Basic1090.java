import java.util.Scanner;

public class Basic1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long interval = sc.nextInt();
        long no = sc.nextInt();
        int i = 1;

        while (i < no) {
            start *= interval;
            i++;
        }
        System.out.println(start);
    }
}
