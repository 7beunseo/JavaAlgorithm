package ch2;

import java.io.*;
import java.util.StringTokenizer;

public class Num1 {
    public String solution(int n, int[] arr) {
        int front = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(front < arr[i]) sb.append(arr[i]).append(" ");
            front = arr[i];
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Num1 T = new Num1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, arr));
    }
}
