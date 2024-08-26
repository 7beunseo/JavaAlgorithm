package ch5;

import java.io.*;
import java.util.*;

public class Num2 {
    public String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char x : str.toCharArray()) {
            if(x == ')') {
                stack.pop(); // '(' pop
            }

            else if(x == '(') {
                stack.push(x);
            }

            else {
                if (stack.isEmpty()) // t스택이 비어있고, '('와 ')' 가 아니라면 문자열에 담음
                    sb.append(x);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Num2 T = new Num2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(T.solution(str));
    }
}
