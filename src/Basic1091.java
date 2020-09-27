import java.util.Scanner;

public class Basic1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long mulval = sc.nextInt();
        long plusval = sc.nextInt();
        long no = sc.nextInt();
        long result = start;
        int i = 1;
        while (i < no) {
            result = result * mulval + plusval;
            i++;
        }
        System.out.println(result);
    }
}
