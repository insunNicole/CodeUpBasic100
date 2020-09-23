import java.util.Scanner;
// 정수 3개를 입력 받아 가장 작은 수를 출력하시오.
public class Basic1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        long result = ((a<b?a:b)>c)?c:(a<b?a:b);
        System.out.println(result);
    }
}
