package ch6;

import java.io.*;
import java.util.*;

public class Num10 {
    // 가능한 말의 수 리턴
    public int count(int[] arr, int dist) { // dist는 가장 가까운 말의 거리
        int cnt = 1;
        int ep = arr[0];

        for(int i = 0; i < arr.length; i++) {
            // arr[i] 지점에 말을 넣을 수 있는지 판별해야 함
            // 현재의 지점 - 바로 직전의 마구간의 좌표를 빼야 함 (거리)
            if(arr[i] - ep >= dist) {
                // 말을 배치할 수 있음
                // 말 한마리를 늘림
                cnt ++;
                // end position 현재 위치로 변경
                ep = arr[i];
            }
        }
        return cnt;
    }
    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        // 좌표 정렬하기
        Arrays.sort(arr);

        int lt = 1; // 마구간의 첫번째 좌표가 아닌, 거리 1이라는 의미임
        int rt = arr[n - 1];

        // 이분 검색 시작
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            // 결정 알고리즘
            // mid가 유효한가, 말의 개수가 m개 이상이라면 말 사이의 거리 답으로 유효함
            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }
            else { // 말의 거리가 너무 넓은 경우, 즉 m개의 말이 배치될 수 없는 경우
                // 답이 더 작은 쪽으로 가야 함
               rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num10 T = new Num10();

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
