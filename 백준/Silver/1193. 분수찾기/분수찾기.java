import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        // 1(1) : 1
        // 2 ~ 3(2) : 2
        // 4 ~ 6(3) : 3
        // 7 ~ 10(4) : 4
        // 분모 : 내림차순, 분자 : 오름차순
        if(n == 1) sb.append("1").append("/").append("1");
        else {
            int bef = 1, count = 1;
            while (true) {
                if (bef <= n && (bef + count) > n) {
                    // 현재 줄에서 몇 번째에 위치하는가?
                    n -= (bef - 1);
                    // 위에서부터의 거리
                    int denominator = count - n + 1;
                    if(count % 2 == 0) sb.append(n).append("/").append(denominator);
                    else sb.append(denominator).append("/").append(n); // 홀수라면 역으로 올라가므로 순서 변경 
                    break;
                }
                count++;
                bef += count - 1; // 주의 1 빼주어야 함
            }
        }
        System.out.println(sb);
        br.close();
    }
}