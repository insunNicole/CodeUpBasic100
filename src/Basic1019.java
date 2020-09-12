import java.util.Arrays;
import java.util.Scanner;

public class Basic1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 2020.9.12 형식으로 입력을 받는다
        String dateInput = sc.next();
        // 2. 월 혹은 일이 한 자릿수 일 때는 앞에 0을 붙여줘야 한다.
        //    >> split함수를 이용해서 . 기준으로 문자열을 나누어 배열에 저장한다.
        // .은 메타문자로 이스케이프를 해주어야 한다.
        String[] dateArr = dateInput.split("\\.");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
