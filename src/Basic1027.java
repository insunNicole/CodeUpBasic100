import java.util.Scanner;

public class Basic1027 {
    public static void main(String[] args) {
        String[] date = new Scanner(System.in).next().split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]),
                Integer.parseInt(date[1]),
                Integer.parseInt(date[0]));
    }
}
