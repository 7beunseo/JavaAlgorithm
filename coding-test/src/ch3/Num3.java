package ch3;

import java.io.*;
import java.util.*;

public class Num3 {
    public int solution(int n, int k, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n - k; i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if(max < sum) max = sum;
        }
        return max;
    }

    public static void main(String[] args) throws IOException{
        Num3 T = new Num3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, k, arr));
    }
}
