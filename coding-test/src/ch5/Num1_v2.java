package ch5;

import java.io.*;
import java.util.*;

public class Num1_v2 {
    // (()()))
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') stack.push(x); // 여는 괄호를 push
            else {
                if(stack.isEmpty())  // 스택이 비어있다면
                    return "NO";
                stack.pop(); // 가장 최근에 들어온 값 pop -> 굳이 변수에 담아 확인할 필요 없음
            }
        }

        // 여는 괄호가 남아있는 경우
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num1_v2 T = new Num1_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(T.solution(str));
    }
}
