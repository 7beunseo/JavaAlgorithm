package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num7 {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        // str = str.toLowerCase();

        // 직접 비교
        /*
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(!(str.charAt(i) == str.charAt(len - 1 - i)))
                return "NO";
        }
        return "YES"; */

        // StringBuilder 사용
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) // 대소문자 차이 무시
            return "YES";
        return "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
