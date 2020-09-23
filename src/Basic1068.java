import java.util.Scanner;

public class Basic1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String score = "";

        if (a >= 90) {
            score = "A";
        } else if (a >= 70 && a <= 89) {
            score = "B";
        } else if (a >= 40 && a <= 69) {
            score = "C";
        } else if (a <= 39) {
            score = "D";
        }

        System.out.println(score);
    }
}
