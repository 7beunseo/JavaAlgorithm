package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11 {
    public int solution(int n, int[][] arr) {
        // 5학년은 정해져있음 1~5학년
        int[] resArr = new int[n];
        for(int i = 0; i < n-1; i++) {
            for(int k = i + 1; k < n; k++) {
                // 학년을 비교함
                for(int j = 0; j < 5; j++) {
                    if(arr[i][j] == arr[k][j]) {
                        resArr[i]++;
                        resArr[k]++;
                        break; // 학생은 한번만 세야 함
                    }
                }
            }
        }
        int max = -1;
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(max < resArr[i]) {
                index = i;
                max = resArr[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) throws IOException {
        Num11 T = new Num11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][5];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < 5; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        
        System.out.println(T.solution(n, arr));
    }
}
