import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 0번 : 점 4개 ( 2 ** 2)
        // 1번 : 점 9개 (3 ** 3 )
        // 2번 : 점 25개 (5 ** 5)
        // 3번 : 점  ( 9 ** 9)
        // 바로 이전 가로 하나당 점이 n개였다면 ((2n - 1) ** (2n -1))
        int dot = 2;
        for(int i = 0; i < n; i++) dot = 2 * dot - 1;
        System.out.println((int)Math.pow(dot, 2));
        br.close();
    }
}