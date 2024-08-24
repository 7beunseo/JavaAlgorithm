package ch3;

import java.io.*;
import java.util.*;

public class Num6 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;

        for(int rt = 0; rt < n; rt++) {
            // rt가 0이라면 1으로 변경
            if(arr[rt] == 0) cnt++;
            // 만약 바꾼 횟수가 k보다 크다면
            while(cnt > k) {
                // lt가 0인 곳을 찾고, 바꾼 횟수 1 감소
                if(arr[lt] == 0) cnt --;
                lt++;
            }
            // 길이의 최댓값을 구함
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num6 T = new Num6();
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
