package ch6;

import java.io.*;
import java.util.*;

public class Num2 {
    public int[] solution(int n, int[] arr) {
        // 버블 정렬
        for(int i = 0; i < n - 1; i++) {
            // 큰 수를 뒤로 밀어서 뒤 부터 정렬
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        Num2 T = new Num2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.stream(T.solution(n, arr)).forEach(num -> System.out.print(num + " "));
    }
}
