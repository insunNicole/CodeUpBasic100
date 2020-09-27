import java.util.Scanner;

public class Basic1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word;
        while (true) {
            word = sc.next().charAt(0);

            if (word == 'q') {
                System.out.println(word);
                break;
            }

            System.out.println(word);
        }
    }
}
