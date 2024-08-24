package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Num1 {
    public int[] solution(int n, int[] arr1, int m, int arr2[]) {
        StringBuilder sb = new StringBuilder();
        // int 배열을 합침
        int[] newArr = (IntStream.concat(IntStream.of(arr1), IntStream.of(arr2))).toArray();
        Arrays.sort(newArr);
        return newArr;
    }

    public static void main(String[] args) throws IOException {
        Num1 T = new Num1();

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
