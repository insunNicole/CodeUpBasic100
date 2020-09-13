import java.util.Scanner;

public class Basic1025 {
    public static void main(String[] args) {
        String num = new Scanner(System.in).nextLine();
        char[] number = num.toCharArray();
        System.out.println("[" + number[0] + "0000]");
        System.out.println("[" + number[1] + "000]");
        System.out.println("[" + number[2] + "00]");
        System.out.println("[" + number[3] + "0]");
        System.out.println("[" + number[4] + "]");
    }
}
