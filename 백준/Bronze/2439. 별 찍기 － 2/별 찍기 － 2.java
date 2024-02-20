import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder cb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int i, k;
        
        for(i = 1; i <= n; i++){
            for(k = 0; k < n - i; k++)
                cb.append(" ");
            for(k = 0; k < i; k++) {
                cb.append("*");
            }
            cb.append("\n");
        }
        System.out.println(cb);
    }
}