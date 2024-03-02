import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            StringBuilder append = sb.append(num / 25).append(" ");
            num = num % 25;
            sb.append(num / 10).append(" ");
            num = num % 10;
            sb.append(num / 5).append(" ");
            sb.append(num % 5).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}