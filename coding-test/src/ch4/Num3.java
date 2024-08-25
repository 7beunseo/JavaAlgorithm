package ch4;

import java.io.*;
import java.util.*;

public class Num3 {
    public int[] solution(int n, int k, int[] arr) {
        int rt = k, lt = 0;
        int answer[] = new int[n - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        // 초기 k개의 데이터 넣어둠
        for(int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // sliding window
        for(int i = 0; i <= n - k; i++) {
            answer[i] = map.size();
            // 끝까지 돌았다면 멈춤
            if(i == n - k) break;
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if(map.get(arr[lt]) == 1) map.remove(arr[lt]);
            else map.put(arr[lt], map.get(arr[lt]) - 1);
            rt++;
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num3 T = new Num3();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.stream(T.solution(n, k, arr)).forEach(i -> System.out.print(i + " "));
    }
}
