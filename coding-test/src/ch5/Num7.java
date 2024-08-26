package ch5;

import java.io.*;
import java.util.*;

public class Num7 {
    public String solution(String str1, String str2) { // need와 plan으로 의미있는 변수명 짓기
        Queue<Character> queue = new LinkedList<>();

        // 초기화
        for(char x : str1.toCharArray()) {
            queue.offer(x);
        }

        for(char x : str2.toCharArray()) {
            // 필수 과목인가?
            // if(queue.contains(x)) -> if(x != queue.poll()) 로 비교해도 됨
            if(x == queue.peek()) queue.poll();
            // 순서대로 비교해서 필수과목을 뺀 후 비어있는가?
            if(queue.isEmpty()) return "YES";
        }

        // 순서가 어긋남
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        Num7 T = new Num7();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(T.solution(str1, str2));
    }
}
