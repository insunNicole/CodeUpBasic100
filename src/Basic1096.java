import java.util.Arrays;
import java.util.Scanner;

public class Basic1096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(); // 바둑판에 올려 놓을 흰돌의 개수
        int[][] goBoard = new int[19][19];

        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            goBoard[a-1][b-1] = 1;
        }

        for(int i=0; i<goBoard.length; i++) { //행
            for(int j=0; j<goBoard.length; j++) { //열
                System.out.print(goBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
