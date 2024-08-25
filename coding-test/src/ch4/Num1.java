package ch4;

import java.io.*;
import java.util.*;


public class Num1 {
    public char solution(int n , String str) {
        // char 초기화
        char answer = ' ';
        // char -> Character 형으로 넣음
        HashMap<Character, Integer> map = new HashMap<>();
        // map.put('A', 3); 처럼 사용 
        for(char c: str.toCharArray()) {
            // map.getOrDefault(char, defaultValue); 찾지 못하면 디폴트 값을 가져옴
            map.put(c, map.getOrDefault(c, 0) + 1); // 값 1 증가
        }

        int max = Integer.MIN_VALUE;
        // 존재하는 키를 모두 가져와서 for문을 돌림
        for(char key : map.keySet()) {
            // System.out.println(key + |" " + map.get(x)); 요소를 모두 출력
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num1 T = new Num1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String abc = br.readLine();

        System.out.println(T.solution(n, abc));
    }
}
