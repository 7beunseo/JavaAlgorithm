package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num12 {
    public int solution(int n, int m, int[][] arr) {
        int i, j, k;
        int count = 0;
        // 4명 중 한명 -> 1부터 시작하므로 i와 k가 1부터 시작해야 함
        for(i = 1; i <= n; i++) {
            // 4명 중 한명
            for(k = 1; k <= n; k++) {
                // 각각 3번 비교 (자기 표함)
                for(j = 0; j < m; j++) {
                    int pi = 0, pk = 0;
                    for(int s = 0; s < n; s++) {
                        if(arr[j][s] == i) pi = s;
                        if(arr[j][s] == k) pk = s;
                    }
                    if(pi >= pk) break;
                }
                if(j == m) {
                    count++;
            }
        }
        return count ;
    }

    public static void main(String[] args) throws IOException {
        Num12 T = new Num12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < n; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(T.solution(n, m, arr));
    }
}
