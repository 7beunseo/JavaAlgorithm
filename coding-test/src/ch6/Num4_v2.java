package ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num4_v2 {
    public int[] solution(int s, int n, int[] arr) {
        // 배열로 풀이
        int[] cache = new int[s];

        for(int x : arr) {
            int pos = -1;
            // 캐시에 들어있는지 확인
            for(int i = 0; i < s; i++) {
                if(x == cache[i]) { // 캐시 히트
                    pos = i; // 히트된 인덱스를 저장
                    break;
                }
            }
            if(pos == -1) { // 캐시 미스 상황
                // 뒤로 1씩 밀려남
                for(int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
            else { // 캐시 히트 상황
                // 히트 된 지점만 당기면 됨
                for(int i = pos; i >= 1; i--)
                    cache[i] = cache[i - 1];
                cache[0] = x;
            }
        }

        return cache;
    }

    public static void main(String[] args) throws IOException {
        Num4_v2 T = new Num4_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 결과를 리스트에 저장하여 반대로 출력
        Arrays.stream(T.solution(s, n, arr)).forEach(num -> System.out.print(num + " "));
    }
}
