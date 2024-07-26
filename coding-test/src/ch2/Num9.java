package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num9 {
    public int solution(int n, int[][] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // 세로 검사
            sum = 0;
            for (int k = 0; k < n; k++) {
                sum += arr[i][k];
            }
            max = Math.max(max, sum);

            // 가로 검사
            sum = 0;
            for (int k = 0; k < n; k++) {
                sum += arr[k][i];
            }
            max = Math.max(max, sum);
        }
        // 대각선 검사
        sum = 0;
        for(int i = 0; i < n; i++)
            sum += arr[i][i];
        max = Math.max(max, sum);
        sum = 0;
        for(int i = 0; i < n; i++)
            sum += arr[i][n-i-1];
        max = Math.max(max, sum);
        return max;
    }
    public static void main(String[] args) throws IOException {
        Num9 T = new Num9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < n; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
