package ch1;
import java.util.*;

public class Num10 {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) {
                p = 0;
            }
            else {
                p++;
            }
            answer[i] = p;
        }
        p = 1000;
        for(int i = s.length() -1; i >= 0; i--) {
            if(s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); // 기존 값과 p 중 더 작은 값을 넣음
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Num10 T = new Num10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0); // 문자 한개를 읽을 경우
        for (int x : T.solution(str, c)){
            System.out.print(x + " ");
        }
    }
}
