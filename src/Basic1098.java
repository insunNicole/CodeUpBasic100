import java.util.Scanner;

public class Basic1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt(); // 격자판의 세로 길이
        int width = sc.nextInt(); // 격자판의 가로 길이
        int length, direction, x, y;

        int[][] board = new int[height][width]; // 격자판

        // 빈보드 제작, 먼저 모든 칸을 0으로 채운다.
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = 0;
            }
        }

        int stickCnt = sc.nextInt(); // 놓을 수 있는 막대의 개수.

        for (int i = 0; i < stickCnt; i++) {
            length = sc.nextInt();
            direction = sc.nextInt();
            x = sc.nextInt() - 1; // 2
            y = sc.nextInt() - 1; // 3

            if (direction == 0) { // 0은 가로, 1은 세로
                for (int j = 0; j < length; j++) {
                    board[x][y + j] = 1;
                }
            } else {
                for (int k = 0; k < length; k++) {
                    board[x + k][y] = 1;
                }
            }
        }
        // 보드 출력
        for (int m = 0; m < height; m++) {
            for (int j = 0; j < width; j++) {
                System.out.print(board[m][j] + " ");
            }
            System.out.println("");
        }
    }
}
