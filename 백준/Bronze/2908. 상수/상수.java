import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt((new StringBuilder(st.nextToken()).reverse().toString()));
        int num2 = Integer.parseInt((new StringBuilder(st.nextToken()).reverse().toString()));
        int res = num1 > num2 ? num1 : num2;
        System.out.println(res);
        br.close();
    }
}