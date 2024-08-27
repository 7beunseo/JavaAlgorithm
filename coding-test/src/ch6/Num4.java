package ch6;

import java.io.*;
import java.util.*;

public class Num4 {
    public Queue<Integer> solution(int s, int n, int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            // queue에 있다면 제거
            if(queue.contains(arr[i])) {
                queue.remove(arr[i]);
            }
            // queue의 맨 앞에 arr[i]를 넣음
            queue.offer(arr[i]);
            // queue의 사이즈를 s로 유지
            while(queue.size() > s)
                queue.poll();
        }
        return queue;
    }

    public static void main(String[] args) throws IOException {
        Num4 T = new Num4();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 결과를 리스트에 저장하여 반대로 출력
        List<Integer> resultList = new ArrayList<>(T.solution(s, n, arr));
        Collections.reverse(resultList);
        resultList.forEach(num -> System.out.print(num + " "));
    }
}
