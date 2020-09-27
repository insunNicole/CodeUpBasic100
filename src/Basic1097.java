import java.util.Scanner;

public class Basic1097 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] goBoard = new int[19][19];
        int count = scan.nextInt(); // 십자 뒤집기 횟수


        for (int i = 0; i < count; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            goBoard[a - 1][b - 1] = 1;
        }

        for (int i = 0; i < goBoard.length; i++) { //행
            for (int j = 0; j < goBoard.length; j++) { //열
                System.out.print(goBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
