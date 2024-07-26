package ch2;
import java.util.*;
import java.io.*;
public class Num2 {
    public int solution(int n, int[] arr) {
        int front = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(front < arr[i]) {
                front = arr[i];
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        Num2 T = new Num2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n, arr));
    }
}
