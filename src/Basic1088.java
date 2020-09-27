import java.util.Scanner;

public class Basic1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        long sum = 0;

        for (int i = 1; i <= end; i++) {
            sum++;
                if(sum % 3 != 0) {
                    System.out.print(sum + " ");
                }
        }
    }
}
