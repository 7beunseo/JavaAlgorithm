package ch3;

import java.io.*;
import java.util.*;

public class Num4 {
    public int solution(int n, int m, int[] arr) {
        int count = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int k = i; k < n; k++) {
                sum += arr[k];
                if(sum == m) {
                    count ++;
                    break;
                }
                else if(sum > m) break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Num4 T = new Num4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, m, arr));
    }
}
