package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num4 {
    public static StringBuilder solution(int n, String[] str) {
        // ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        /*
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString(); // reverse한 후 toString으로 문자열로 만듦
            sb.append(tmp).append("\n");
        }*/

        // 하나하나 뒤집어야 하는 경우
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() -1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = s[lt];
                lt++;
                rt--;
            }
            // String tmp = String.valueOf(s); string화 함
            sb.append(s).append("\n");
        }
        return sb;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];
        for(int i = 0; i < num; i++)
            str[i] = br.readLine();

        System.out.println(solution(num, str));
    }
}
