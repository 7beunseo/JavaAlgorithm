package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num8 {
    public String solution(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int k = 0; k < n; k++) {
                if(arr[i] < arr[k]) count ++; // <= 라고 하면 오답
            }
            sb.append(count + 1).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        Num8 T = new Num8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, arr));
    }
}
