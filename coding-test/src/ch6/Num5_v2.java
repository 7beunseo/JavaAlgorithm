package ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num5_v2 {
    public String solution(int n, int[] arr) {
        Arrays.sort(arr); // 배열 정렬하는 법
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) return "D";
        }
        return "U";
    }

    public static void main(String[] args) throws IOException {
        Num5_v2 T = new Num5_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, arr));
    }
}
