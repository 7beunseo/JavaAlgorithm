package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num6 {
    public String solution(int n, String[] arr) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            int reverseStr = Integer.parseInt(sb.reverse().toString());
            /*
            * int tmp = arr[i];
            * int res = 0;
            * while(tmp > 0) {
            *   int t = tmp % 10;
            *   res = res * 10 + t;
            *   tmp = tmp / 10;
            * }
            * */
            int k = 2;
            for( ; k < reverseStr; k++) {
                if(reverseStr % k == 0) break;
            }
            if(k == reverseStr)
                answer.append(reverseStr).append(" ");
        }
        return answer.toString();
    }
    public static void main(String[] args) throws IOException {
        Num6 T = new Num6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = st.nextToken();
        }

        System.out.println(T.solution(n, arr));
    }
}
