package ch4;

import java.io.*;
import java.util.*;

public class Num4 {
    public int solution(String str1, String str2) {
        int lt = 0, answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();

        // str2을 hashMap으로 변환
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < str2.length(); i++)
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);

            // str2 배열 크기보다 1 작은 인덱스까지 초기화
        for(int i = 0; i < str2.length() - 1; i++)
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);

        for(int rt = str2.length() - 1; rt < str1.length(); rt++) {
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0) + 1);
            // equals로 같은지 비교
            if(map2.equals(map1)) answer++;
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if(map1.get(str1.charAt(lt)) == 0) map1.remove(str1.charAt(lt));
            lt ++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num4 T = new Num4();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(T.solution(str1, str2));
    }
}
