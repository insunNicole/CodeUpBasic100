import java.util.Scanner;

public class Basic1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentCount = new int[23];
        int count = sc.nextInt();

        for(int i=0; i<count; i++){
            int numbers = sc.nextInt();
            studentCount[numbers - 1] += 1;
        }
        for(int j=0; j<studentCount.length;j++){
            System.out.print(studentCount[j] + " ");
        }
    }
}
