package ch6;

import java.io.*;
import java.util.*;

public class Num9 {
    // 해당 용량으로 몇장의 DVD가 필요한가?
    public int count(int[] arr, int capacity) {
        int cnt = 1; // 적어도 1장이 필요함
        int sum = 0; // 합
        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // arr의 최댓값을 구해줌, int형으로 리턴
        int rt = Arrays.stream(arr).sum(); // 기본으로 int를 리턴함
        while(lt <= rt) {
            int mid = (lt + rt) / 2; // mid 값을 용량으로 가정
            if(count(arr, mid) <= m) { // 장 수가 m보다 작거나 같으면 가능함
                answer = mid;
                rt = mid - 1; // 더 작은 값을 향해 감
            }
            else {
                lt = mid + 1; // 작은 범위 의미 없음 -> 늘려야 함
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num9 T = new Num9();

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
