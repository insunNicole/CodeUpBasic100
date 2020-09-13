import java.util.Scanner;

public class Basic1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.next().split("\\.");
        System.out.println(num[0]);
        System.out.println(num[1]);
    }
}
