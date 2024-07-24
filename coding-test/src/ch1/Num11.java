package ch1;

import java.util.*;

public class Num11 {
    public String solution(String s) {
        char c1 = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; ; i++) {
            char c2 = s.charAt(i);
            if(c2 == c1) {
                count++;
            }
            else {
                sb.append(c1);
                if (count > 1)
                    sb.append(count);
                c1 = c2;
                count = 1;
            }
            /* s에 빈 문자를 넣는 방법도 있음 */
            /* s = s + " "; */
            if(i == s.length() -1) {
                sb.append(c1);
                if(count > 1)
                    sb.append(count);
                return sb.toString();
            }
        }
    }

    public static void main(String[] args) {
        Num11 T = new Num11();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}

/**
 * count를 0으로 잡아서 문제 발생
 * append에 c2를 해서 문제 발생
 */