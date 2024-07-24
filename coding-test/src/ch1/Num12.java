package ch1;
import java.util.*;

public class Num12 {
    public String solution(int len, String s) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < len; i++) {
            // String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); 한번에 치환하기
            // s.substring(7); // 앞 7만큼 자르기
            String str = s.substring(i * 7, i * 7 + 7);
            StringBuilder sb = new StringBuilder();
            for(int k = 0 ; k < 7; k++) {
                if (str.charAt(k) == '#') sb.append(1);
                else sb.append(0);
            }
            int num = Integer.parseInt(sb.toString(), 2);
            answer.append((char) num);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Num12 T = new Num12();

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(length, str));
    }
}
