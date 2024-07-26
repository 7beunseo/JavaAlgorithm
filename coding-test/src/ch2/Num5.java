package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5 {
    public int solution(int n) {
        int answer = 0;

        int[] ch = new int[n+1];
        for(int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                answer ++;
                for(int j = i; j <= n; j = j + i)
                    ch[j] = 1;
            }
        }
//        TIME 에러
//        for(int i = 2; i < n; i++) {
//            boolean flag = true;
//            for(int k = 2; k < i; k++) {
//                if(i % k == 0)
//                    flag = false;
//            }
//            if(flag) {
//                answer ++;
//            }
//        }


        return answer;
    }
    public static void main(String[] args) throws IOException {
        Num5 T = new Num5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }
}
