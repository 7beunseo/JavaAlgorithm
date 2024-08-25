package ch4;

import java.io.*;
import java.util.*;

public class Num2 {
    public boolean solution(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(char c : map1.keySet()) {
            // key가 없으면 아나그램이 아님
            int n = map2.getOrDefault(c, -1);
            if(n == -1) return false;
            // 같은 key에 대해 value 값이 다르면 아나그램이 아님
            if(n != map1.get(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Num2 T = new Num2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(T.solution(str1, str2) ? "YES" : "NO");
    }
}
