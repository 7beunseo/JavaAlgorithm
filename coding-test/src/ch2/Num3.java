package ch2;

import java.io.*;
import java.util.*;

public class Num3 {
    public String solution(int n, int arrA[], int arrB[]) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(arrA[i] == arrB[i])
                sb.append("D").append("\n");
            else if(arrA[i] - arrB[i] == 1 || arrA[i] - arrB[i] == -2)
                sb.append("A").append("\n");
            else sb.append("B").append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        Num3 T = new Num3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        int arrA[] = new int[n];
        int arrB[] = new int[n];
        for(int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(stA.nextToken());
            arrB[i] = Integer.parseInt(stB.nextToken());
        }
        System.out.println(T.solution(n, arrA, arrB));
    }
}
