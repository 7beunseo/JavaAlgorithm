package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num3 {
    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE; // 가장 작은 값으로 초기화

        String[] s = str.split(" "); // 공백을 기준으로 단어 분리

        /*
        for(String x : s) {
            int len = x.length();
            if(len > max) {
                answer = x;
                max = len;
            }
        }*/

        // indexOf 사용
        int pos;
        while((pos = str.indexOf(' ')) != -1) { // 띄어쓰기를 발견한 경우
            String tmp = str.substring(0, pos); // 0부터 공백 전까지 자름
            int len = tmp.length();
            if(len > max){
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); // str 자름
        }
        // 마지막 단어도 확인
        if(str.length() > max)
            answer = str;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
