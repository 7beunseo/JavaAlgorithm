package ch3;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Num2 {
    public ArrayList<Integer> solution(int n, int[] arr1, int m, int arr2[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] concatArr = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
        // 정렬
        Arrays.sort(concatArr);
        for(int i = 0; i < n + m -1; i++) {
            if(concatArr[i] == concatArr[i+1]) {
                answer.add(concatArr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        Num2 T = new Num2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr1[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int arr2[] = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        T.solution(n, arr1, m, arr2).forEach(num -> System.out.print(num + " "));

    }
}
