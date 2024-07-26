import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;
        while((n = Integer.parseInt(br.readLine())) != -1) {
            int sum = 0;
            StringBuilder s = new StringBuilder();
            for(int i = 1; i< n; i++) {
                if(n % i == 0) {
                    sum += i;
                    s.append(i).append(" + ");
                }
            }
            s.delete(s.length() - 3, s.length()); // 마지막 + 문자 제거
            if(sum == n) sb.append(n).append(" = ").append(s).append("\n");
            else sb.append(n).append(" is NOT perfect.").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}