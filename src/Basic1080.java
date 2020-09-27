import java.util.Scanner;

public class Basic1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=end; i++){
            sum+=i;
            if(sum >= end){
                System.out.println(i);
                break;
            }
        }
    }
}
