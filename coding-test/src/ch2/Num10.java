package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 고민 함
 */
public class Num10 {
    public int solution(int n, int[][] arr) {
        int count = 0;
        // int[] dx = {-1, 0, 1, 0);
        // int[] dy = {0, 1, 0, -1};
        for(int i = 1; i < n+1; i++) {
            for(int k = 1; k < n+1; k++) {
                // boolean flag = true;
                // for(int k = 0; k < n; k++) {
                //  int nx = i + dx[k];
                //  int ny = j + dy[k];
                //  if(nx >= 0 && nx < n && ny < n && arr[nx][ny] >= arr[i][j]) {
                //      flag= = false;
                //        break;
                //      }
                if((arr[i][k] > arr[i-1][k]) &&
                    arr[i][k] > arr[i][k-1] &&
                    arr[i][k] > arr[i+1][k] &&
                    arr[i][k] > arr[i][k+1])
                {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) throws IOException {
        Num10 T = new Num10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[][] = new int[n+2][n+2]; // 양 옆 2개를 늘려줘야 함
        for(int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 1; k < n+1; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }
//        for(int i = 0; i < n+1; i++) {
//            for(int k = 0; k < n+1; k++) {
//                System.out.print(arr[i][k] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(T.solution(n, arr));
    }
}
