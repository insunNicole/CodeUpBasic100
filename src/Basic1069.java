import java.util.Scanner;

public class Basic1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";

        switch (word.charAt(0)) {
            case 'A':
                result = "best!!!";break;
            case 'B':
                result = "good!!";break;
            case 'C':
                result = "run!";break;
            case 'D':
                result = "slowly~";break;
            default:
                result = "what?";break;
        }
        System.out.println(result);
    }
}
