package ch5;

import java.io.*;
import java.util.*;

public class Num6 {
    public int solution(int n, int k) {
        int answer = 0;
        // 큐 선언
        Queue<Integer> Q = new LinkedList<>();

        // 큐 세팅
        for(int i = 1; i <= n; i++) Q.offer(i);

        while(!Q.isEmpty()) { // 큐가 비어있지 않다면
            // k 만큼 반복
            for(int i = 1; i < k; i++)
                Q.offer(Q.poll()); // 앞에서 뺀 값을 뒤에 넣음

            // k번째 위치의 값을 제거
            Q.poll();

            // 1개 남았는지 확인
            if(Q.size() == 1) answer = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num6 T = new Num6();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, k));
    }
}
