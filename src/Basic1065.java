import java.util.Scanner;

public class Basic1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i =0; i< a.length; i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
