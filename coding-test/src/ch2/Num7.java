package ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num7 {
    public int solution(int n, int[] arr) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                count++;
                sum += count;
            }
            else {
                count = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        Num7 T = new Num7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, arr));
    }
}
