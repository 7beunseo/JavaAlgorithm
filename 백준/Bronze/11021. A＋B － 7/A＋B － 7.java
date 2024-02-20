import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder cb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int a, b;
        
        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            cb.append("Case #" + i + ": " + (a + b)+"\n");
        }
        System.out.println(cb);
    }
}