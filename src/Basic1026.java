import java.util.Scanner;

public class Basic1026 {
    public static void main(String[] args) {
        String[] time = new Scanner(System.in).nextLine().split(":");
        System.out.println(Integer.parseInt(time[1])*1);
    }
}
