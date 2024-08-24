package ch3;

import java.io.*;

public class Num5_v2 {
    public int solution(int n) {
        int answer = 0, cnt = 1; // 연속된 자연수의 개수
        n--;
        while(n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer ++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num5_v2 T = new Num5_v2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }
}
