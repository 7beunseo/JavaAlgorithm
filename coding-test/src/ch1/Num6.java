package ch1;

import java.io.*;

public class Num6 {
    public static StringBuilder solution(String str) {
        StringBuilder sb = new StringBuilder();
        int lt = 0, rt = str.length() -1;
        char[] s = str.toCharArray();
        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) // 알파벳이 아니면 1 증가
                lt++;
            else if(!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        sb.append(s);
        return sb;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}