import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빈 공백만 넣으면 0으로 출력되어야 했음
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
        br.close();
    }
}