import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 9; i++){
            sb.append(a + " * " + i + " = " + a*i + "\n");
        }
        System.out.println(sb);
    }
}