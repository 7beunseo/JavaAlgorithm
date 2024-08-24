package ch3;

import java.io.*;

public class Num5 {
    public int solution(int n) {
        // 연속 부분 수열으로 봐도 무방 -> two pointer 사용
        int p1 = 1, p2 = 2, count = 0;
        int sum = p1 + p2;
        while(p2 <= (n / 2 + 1)) { // 절반보다 2 큰 값이면 더이상 2개를 더해서 n이 나올 수 없음
            if(sum > n) sum -= p1++; // 뺀 후 증가해야 하므로 후위 연산자를 사용함
            else if(sum < n) sum += ++p2; // 증가한 후 더해야 하므로 전위 연산자를 사용함
            else {
                count++;
                sum -= p1++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Num5 T = new Num5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(T.solution(n));
    }
}
