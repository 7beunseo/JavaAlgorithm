import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int row = 0;
        int column = 0;
        int arr[][] = new int[9][9];
        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < 9; k++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i][k] = n;
                if (arr[row][column] < n) {
                    row = i;
                    column = k;
                }
            }
        }
        sb.append(arr[row][column]).append("\n").append(row + 1).append(" ").append(column + 1);
        System.out.println(sb);
        br.close();
    }
}