package ch6;

import java.io.*;
import java.util.*;

public class Num8 {
    public int solution(int n, int m, int[] arr) {
        // 이분검색
        // 이분검색은 정렬되어있어야 함
        Arrays.sort(arr);

        int lt = 0, rt = n - 1;
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] > m) rt = mid - 1;
            else if(arr[mid] < m) lt = mid + 1;
            else return lt + 1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Num8 T = new Num8();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, m, arr));
    }
}
