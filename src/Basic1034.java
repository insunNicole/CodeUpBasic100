import java.util.Scanner;

public class Basic1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  2진수,8진수,16진수를 10진수로 변환하기 위해선 Integer
        //  클래스의 parseInt를 사용한다.
        System.out.println(Integer.parseInt(sc.next(), 8));
    }
}
