import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 1(1) : 1
        // 2 ~ 7(6) : 2
        // 8 ~ 19(12) : 3
        // 20 ~ 37(18) : 4
        // 38 ~ 61(24) : 5
        // 방의 개수가 6의 배수만큼 증가
        int count = 1;
        if (n != 1) {
            int bef = 2, between = 6;
            while(true) {
                count++;
                if(bef <= n && (bef + between) > n) break;
                bef += between;
                between = 6 * count;
            }
        }
        System.out.println(count);
        br.close();
    }
}