package ch6;

import java.io.*;
import java.util.*;

public class Num6 {
    // 똥싼코드..
    public String solution(int n, int[] arr) {
        StringBuilder st = new StringBuilder();
        boolean flag = false; // 철수를 찾았는가?

        for(int i = 1; i < n - 1; i++) {
            // 자신의 앞이 자신보다 크다면 그 앞은 철수
            if(flag == false && arr[i - 1] > arr[i]) {
                st.append(i).append(" "); // 실제는 인덱스 + 1
                flag = true;
            }
            // 자신의 뒤가 자신보다 작다면 그 뒤는 짝궁
            else if(flag && arr[i] > arr[i + 1]) {
                st.append(i + 2); // 실제는 인덱스 + 1

            }
        }
        return st.toString();
    }

    public static void main(String[] args) throws IOException {
        Num6 T = new Num6();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, arr));
    }
}
