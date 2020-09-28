import java.util.Scanner;

public class Basic1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        int[][] goBoard = new int[19][19];
        // 행의 길이는 goBoard.length로 계산하고,
        // 열의 길이는 goBoard[행의인덱스].length스

        // 입력을 받는다.
        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard[i].length; j++) {
                goBoard[i][j] = sc.nextInt();
            }
        }

        // 십자가를 뒤집을 횟수를 입력한다.
        int turnGo = sc.nextInt();

        // 뒤집을 좌표를 입력한다.
        for (int k = 0; k < turnGo; k++) {
            x = sc.nextInt();

            // 들어온 x 값을 확인한다.
            for (int j = 0; j < goBoard.length; j++) {
                if (goBoard[x - 1][j] == 0) {
                    goBoard[x - 1][j] = 1;
                } else {
                    goBoard[x - 1][j] = 0;
                }
            }

            y = sc.nextInt();
            // 들어온 x 값을 확인한다.
            for (int m = 0; m < goBoard.length; m++) {
                if (goBoard[m][y - 1] == 0) {
                    goBoard[m][y - 1] = 1;
                } else {
                    goBoard[m][y - 1] = 0;
                }
            }
        }
        // 배열출력
        for (int i = 0; i < goBoard.length; i++) {
            for (int j = 0; j < goBoard.length; j++) {
                System.out.print(goBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
