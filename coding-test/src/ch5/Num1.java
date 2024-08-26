package ch5;

import java.io.*;
import java.util.*;

public class Num1 {
    // (()()))
    public String solution(String str) {
        int sp = 0;
        char left;
        ArrayList<Character> stack = new ArrayList<>();

        for(char x : str.toCharArray()) {
            if(x == ')') {
                if(stack.isEmpty()) return "NO";
                left = stack.remove(--sp);
                if (left != '(') return "NO";
            }
            else {
                stack.add(x);
                sp++;
            }
        }
        if (stack.isEmpty()) return "YES";
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        Num1 T = new Num1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(T.solution(str));
    }
}
