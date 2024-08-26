package ch5;

import java.io.*;
import java.util.*;

public class Num4 {
    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if('0' <= x && '9' >= x) // Character.isDigit(x) 로 판단할 수도 있음
                stack.push(Integer.parseInt(String.valueOf(x))); // stack.push(x-48)을 해주어도 됨
            else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (x) {
                    case '+' : stack.push(num2 + num1); break;
                    case '-' : stack.push(num2 - num1); break;
                    case '*' : stack.push(num2 * num1); break;
                    case '/' : stack.push(num2 / num1); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) throws IOException {
        Num4 T = new Num4();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();

        System.out.println(T.solution(str));
    }
}
