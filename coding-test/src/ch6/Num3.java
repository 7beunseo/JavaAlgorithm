package ch6;

import java.io.*;
import java.util.*;

public class Num3 {
    public int[] solution(int n, int[] arr) {
        // 삽입 정렬
        for(int i = 1; i < n; i++) {
            int tmp = arr[i];
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] > tmp) {
                    // 뒤로 밀기
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = tmp;
                    break;
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
