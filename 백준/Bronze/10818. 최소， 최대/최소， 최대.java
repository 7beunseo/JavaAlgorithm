import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        int min, max;
        StringTokenizer st = new StringTokenizer(br.readLine());
        min = max = Integer.parseInt(st.nextToken());
        for(int i = 1; i < size; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (min > n)
                min = n;
            else if (max < n)
                max = n;
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        br.close();
    }
}