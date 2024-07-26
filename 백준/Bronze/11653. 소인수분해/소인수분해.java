import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N > 1) {
            boolean flag = true;
            int res = 2;
            while(true) {
                if(N % res == 0) {
                    sb.append(res).append("\n");
                    N /= res;
                    break;
                }
                res++;
            }

        }
        System.out.println(sb);
        br.close();
    }
}