package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Num2_v2 {
    public String solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        // HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 또 hashMap을 만들 필요 없이 str2의 char과 겹치는 value를 1 감소시키면 됨
        for(char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) -1); // 1 감소
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        Num2_v2 T = new Num2_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(T.solution(str1, str2));
    }
}
