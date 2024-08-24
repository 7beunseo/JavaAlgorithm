package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num12 {
    public int solution(int n, int m, int[][] arr) throws IOException {
        int i, j, k;
        int count = 0;
        // Loop through each student as potential mentor (i) and mentee (k)
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n; k++) {
                if (i == k) continue; // Skip if mentor and mentee are the same
                boolean isMentor = true;
                // Check all tests
                for (j = 0; j < m; j++) {
                    int pi = 0, pk = 0;
                    // Find the positions of i and k in each test
                    for (int s = 0; s < n; s++) {
                        if (arr[j][s] == i) pi = s;
                        if (arr[j][s] == k) pk = s;
                    }
                    // If k appears before i in any test, i cannot be a mentor to k
                    if (pi >= pk) {
                        isMentor = false;
                        break;
                    }
                }
                // If i is a mentor for k in all tests, increase count
                if (isMentor) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Num12 T = new Num12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < n; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(T.solution(n, m, arr));
    }
}
