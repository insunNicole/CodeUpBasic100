import java.util.Scanner;

public class Basic1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char plus = sc.next().charAt(0);
        char start = 'a';

        do{
            System.out.println(start);
            start+=1;
        }while(start<=plus);
    }
}
