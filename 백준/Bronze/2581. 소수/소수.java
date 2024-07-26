import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = -1;
        int sum = 0;
        boolean first = true;
        for(int i = M; i <= N; i++) {
            int k;
            for(k = 2; k < i; k++) {
                if(i % k == 0) break;
            }
            if(k == i) {
                sum += i;
                if(first) {
                    min = i;
                    first = false;
                }
            }
        }
        if(min == -1) System.out.println("-1");
        else sb.append(sum).append("\n").append(min);
        System.out.println(sb);
        br.close();
    }
}