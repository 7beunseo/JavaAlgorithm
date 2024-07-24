package ch1;

import java.io.*;
public class Num1 {
    public static int solution(String str, char t) {
        int answer = 0;

        // 모두 대문자로 바꿈
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        /*
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t)
                answer++;
        }
         */

        // foreach 사용
        for(char x : str.toCharArray()) {// 문자열을 문자 배열로 만들어줌
            if (x == t)
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = br.readLine().charAt(0); // 문자 하나만 가져오기 위해 charAt() 사용

        System.out.println(solution(str, c));
    }
}