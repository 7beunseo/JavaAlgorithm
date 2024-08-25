package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num3_v2 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        int lt = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        // 초기 k개의 데이터 넣어둠
        for(int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        // sliding window
        for(int rt = k - 1; rt < n; rt ++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            if(HM.get(arr[lt]) == 1) HM.remove(arr[lt]);
            else HM.put(arr[lt], HM.get(arr[lt]) - 1);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num3_v2 T = new Num3_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        (T.solution(n, k, arr)).forEach(i -> System.out.print(i + " "));
    }
}
