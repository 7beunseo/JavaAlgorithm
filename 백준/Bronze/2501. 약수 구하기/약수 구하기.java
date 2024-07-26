import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int i;
        for(i = 1; i <= N; i++) {
            if(N % i == 0) {
                count++;
                if(K == count) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if(i == N + 1) System.out.println(0);
        System.out.println(sb);
        br.close();
    }
}