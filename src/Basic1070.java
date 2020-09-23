import java.util.Scanner;

public class Basic1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String result = "";

        switch (month) {
            case 12:
            case 1:
            case 2:
                result = "winter";
                break;
            case 3:
            case 4:
            case 5:
                result = "spring";
                break;
            case 6:
            case 7:
            case 8:
                result = "summer";
                break;
            case 9:
            case 10:
            case 11:
                result = "fall";
                break;
        }
        System.out.println(result);
    }
}
