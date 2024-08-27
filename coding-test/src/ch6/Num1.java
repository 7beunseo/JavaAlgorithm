package ch6;

import java.io.*;
import java.util.*;

public class Num1 {
    public int[] solution(int n, int[] arr) {
        // 선택 정렬
        for(int i = 0; i < n - 1; i++) { // n - 1 로 설정해도 됨
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j])
                    idx = j; // 더 작은 수의 인덱스를 담음
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        Num1 T = new Num1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.stream(T.solution(n, arr)).forEach(num -> System.out.print(num + " "));
    }
}
