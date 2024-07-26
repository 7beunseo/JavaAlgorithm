package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num4 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int front = 1;
        int second = 1;
        for(int i = 0; i < n; i++) {
            sb.append(front).append(" ");
            int temp = second;
            second += front;
            front = temp;
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        Num4 T = new Num4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }
}
