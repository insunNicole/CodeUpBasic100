import java.util.Scanner;

public class Basic1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day1 = sc.nextInt();
        int day2 = sc.nextInt();
        int day3 = sc.nextInt();
        int dayCount = 1;

        // day1, day2, day3가 모두 만족하는 dayCount가 되었을 때 반복문 종료하기.
        while (dayCount % day1 != 0 || dayCount % day2 != 0 || dayCount % day3 != 0) {
            dayCount++;
        }
        System.out.println(dayCount);
    }
}
