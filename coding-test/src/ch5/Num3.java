package ch5;

import java.io.*;
import java.util.*;

public class Num3 {
    public int solution(int n, ArrayList<Stack<Integer>> stackList, int m, int[] arr) {
        int answer = 0;
        // 바구니
        Stack<Integer> bucket = new Stack<>();

        for(int i = 0; i < m; i++) {
            int num = arr[i];
            // 해당 스택이 비어있지 않다면
            if(!stackList.get(num - 1).isEmpty()) {
                // 꺼내서 바구니에 넣음
                bucket.push(stackList.get(num - 1).pop());
                // 바구니에 겹치면
                if(bucket.size() > 1 && (Objects.equals(bucket.get(bucket.size() -1), bucket.get(bucket.size() - 2)))) {
                    answer += 2;
                    bucket.pop();
                    bucket.pop();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num3 T = new Num3();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        ArrayList<Stack<Integer>> stackList = new ArrayList<>(5);

        // stack 초기화
        for (int i = 0; i < n; i++) {
            stackList.add(new Stack<>());
        }

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for(int k = 0; k < n; k++) {
                int num = Integer.parseInt(st.nextToken());

                if(num != 0)
                    // k 번째의 스택에 바닥부터 num 값을 추가 (주의)
                    stackList.get(k).add(0, num);
            }
        }

        int m = Integer.parseInt(br.readLine());

        int arr[] = new int[m];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(n, stackList, m, arr));
    }
}
