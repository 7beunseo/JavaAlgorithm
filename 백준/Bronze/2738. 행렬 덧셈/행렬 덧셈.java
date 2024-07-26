import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int arr[][] = new int[y][x];
        for(int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < x; k++){
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < x; k++){
                arr[i][k] += Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < y; i++) {
            for(int k = 0; k < x; k++){
                sb.append(arr[i][k]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}