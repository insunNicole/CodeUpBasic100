import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Basic1086 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String word = br.readLine();
            String[] a = word.split(" ");
            float b = (Float.valueOf(a[0]) * Float.valueOf(a[1])
                    * Float.valueOf(a[2]) ) / (1024 * 1024 * 8);
            bw.write(String.format("%.2f MB", b));
            bw.flush();
        } catch (Exception e) {

        }
    }
}
