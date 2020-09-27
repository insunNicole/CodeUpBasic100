import java.util.Scanner;

// 수 나열하기
public class Basic1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int interval = sc.nextInt();
        int no = sc.nextInt();
        int i = 1;

        while (i < no) {
            start += interval;
            i++;
        }
        System.out.println(start);
    }
}
