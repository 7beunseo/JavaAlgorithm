import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int res = (m - down) / (up - down);
        if(((m - down) % (up - down)) != 0) res++;
        System.out.println(res);
        br.close();
    }
}