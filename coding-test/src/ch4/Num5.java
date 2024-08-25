package ch4;

import java.io.*;
import java.util.*;

public class Num5 {
    public int solution(int n, int k, int[] arr) {
        int answer;
        // TreeSet을 내림차순 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        // 3중 for문으로 모든 경우의 수 체크
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int l = j + 1; l < n; l++)
                    Tset.add(arr[i] + arr[j] + arr[l]);
            }
        }

        // k번째 수 리턴
        int cnt = 0;
        for(int x : Tset) {
            cnt ++;
            if(cnt == k) return x;
        }

        // k번째가 존재하지 않으면 -1 출력
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Num5 T = new Num5();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, k, arr));
    }
}
