package ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Num2_v2 {
    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char x : str.toCharArray()) {
            if(x == ')') {
                // 여는 괄호까지 다 뺌
                while(stack.pop() != '(') ;
            }
            else
                stack.push(x); // 알파벳이어도 스택에 넣음
        }

        // stack에 남은 문자
        for(int i = 0; i < stack.size(); i++)
            sb.append(stack.get(i));
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Num2_v2 T = new Num2_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(T.solution(str));
    }
}
