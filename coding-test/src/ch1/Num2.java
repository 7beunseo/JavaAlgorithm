package ch1;

import java.io.*;
public class Num2 {
    public static String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += (Character.toLowerCase(x));
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}