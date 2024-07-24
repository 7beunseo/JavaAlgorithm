package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9 {
    public static int solution(String str) {
    // answer 가 int 형일 경우
        /*
        int answer = 0;
        for(char x : str.toCharArray()) {
            if(x >= '0' && x <= '9'){
                answer = answer * 10 + x - '0'; // 0을 빼줘야 아스키코드로 연산되지 않음
            }
        }*/

    // answer가 문자열일 경우
    String answer = "";

    for(char x : str.toCharArray()) {
        if (Character.isDigit(x))
            answer += x;
    }
    return Integer.parseInt(answer);
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
