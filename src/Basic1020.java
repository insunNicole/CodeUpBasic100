import java.util.Scanner;

public class Basic1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn = sc.nextLine();
        String[] ssnArr = ssn.split("-");
        System.out.println(ssnArr[0]+ssnArr[1]);
    }
}
