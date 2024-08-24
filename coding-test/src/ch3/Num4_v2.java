package ch3;

import java.io.*;
import java.util.*;

public class Num4_v2 {
    public int solution(int n, int m, int[] arr) {
        int count = 0;
        int rt = 0, lt = 0;
        int sum = arr[0];

        while(rt < n) {
            if(sum < m) rt++;
            else if(sum > m) lt++;
            else count++;
            sum += (arr[rt] - arr[lt]);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Num4_v2 T = new Num4_v2();
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
