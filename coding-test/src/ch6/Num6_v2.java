package ch6;

import java.io.*;
import java.util.*;

public class Num6_v2 {
    public String solution(int n, int[] arr) {
        StringBuilder st = new StringBuilder();

        // 깊은 복사
//        int[] tmp = new int[n];
//        for(int i = 0; i < n; i++) {
//            tmp[i] = arr[i];
//        }

        int[] tmp = arr.clone();

        // tmp 정렬
        Arrays.sort(tmp);

        for(int i = 0; i < n; i++) {
            if(tmp[i] != arr[i]) st.append(i + 1).append(" ");
        }
        return st.toString();
    }

    public static void main(String[] args) throws IOException {
        Num6_v2 T = new Num6_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, arr));
    }
}
