package ch5;

import java.io.*;
import java.util.*;

public class Num5 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ')') {
                stack.pop();
                // ) 이전이 (이었다면 레이저임
                if(str.charAt(i - 1) == '(') {
                    // (를 pop 하고(if 조건에서 진행함) 스택에 남아있는 ( 개수만큼 카운트
                    answer += stack.size();
                }
                // ) 이전이 ) 이었다면 쇠막대기가 잘린 것
                else {
                    // ( 하나만 또 pop 해줌
                    answer++;
                }
            }
            else
                stack.push('(');
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num5 T = new Num5();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();

        System.out.println(T.solution(str));
    }
}
