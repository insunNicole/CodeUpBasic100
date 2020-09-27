import java.util.Arrays;
import java.util.Scanner;

public class Basic1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] students = new int[count];

        for (int i = 0; i < count; i++) {
            int numbers = scan.nextInt();
            students[i] = numbers;
        }

        for (int j = students.length - 1; j >= 0; j--) {
            System.out.printf("%d ", students[j]);
        }
    }
}
