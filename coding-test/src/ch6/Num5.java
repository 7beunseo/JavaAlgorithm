package ch6;

import java.io.*;
import java.util.*;

public class Num5 {
    public String solution(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);

        if(n == set.size()) return "U";
        return "D";
    }

    public static void main(String[] args) throws IOException {
        Num5 T = new Num5();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(n, arr));
    }
}
