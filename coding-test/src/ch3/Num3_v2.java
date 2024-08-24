package ch3;

import java.io.*;
import java.util.*;

public class Num3_v2 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        // 처음 k 만큼의 합을 구함
        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        // sliding window : 뒤의 값을 더하고, 앞의 값을 뺌
        // 이전의 합과 비교
        for(int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        Num3_v2 T = new Num3_v2();
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
