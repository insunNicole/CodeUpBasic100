import java.util.Arrays;
import java.util.Scanner;

public class Basic1095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] students = new int[count];

        for (int i = 0; i < count; i++) {
            int numbers = scan.nextInt();
            students[i] = numbers;
        }
        Arrays.sort(students);
        System.out.println(students[0]);
    }
}
