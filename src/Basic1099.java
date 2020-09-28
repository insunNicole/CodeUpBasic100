import java.util.Scanner;

public class Basic1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] route = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                route[i][j] = sc.nextInt();
            }
        }

        // 맨 아래의 가장 오른쪽에 도착한 경우
        // 더 이상 움직일 수 없는 경우
        // 먹이를 찾은 경우
        // 더 이상 이동하지 않고 그곳에 머무른다.
        // 그리고, 오른쪽이나 아래쪽으로만 움직인다.
        // 개미집은 반드시 (2,2)에 존재하기 때문에 개미는 (2,2)에서 출발한다.
        int go = 0; // 갈수 있는 곳
        int wall = 1; // 벽 또는 장애물

        for (int i = 1; i < route.length; i++) {
            if (go != 1) {
                // 벽이 아니면
                for (int j = wall; j < route[i].length; j++) {
                    if (route[i][j] == 0) {
                        route[i][j] = 9;

                    } else if (route[i][j] == 2) { //먹이발견하면
                        route[i][j] = 9;
                        go = 1;
                        break; //더이상 움직이지 않고 머무른다
                    } else {
                        wall = j - 1;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        //전체 출력 for문
        for (int i = 0; i < route.length; i++) {
            for (int j = 0; j < route.length; j++) {
                System.out.print(route[i][j] + " ");
            }
            System.out.println();
        }


    }
}
