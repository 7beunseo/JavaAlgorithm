package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Num1_v2 {
    public int[] solution(int n, int[] arr1, int m, int arr2[]) {
        int result[] = new int[n + m];
        int p1 = 0, p2 = 0;
        for(int i = 0; i < n + m; i++) {
            if (arr1[p1] > arr2[p2]) {
                result[i] = arr2[p2];
                p2 ++;
            } else {
                result[i] = arr2[p1];
                p1 ++;
            }
            if(p1 == n || p2 == n) {

            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Num1_v2 T = new Num1_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int arr2[] = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int result[] = T.solution(n, arr1, m, arr2);
        Arrays.stream(result).forEach(i -> {
            System.out.print(i + " ");
        });
    }
}
