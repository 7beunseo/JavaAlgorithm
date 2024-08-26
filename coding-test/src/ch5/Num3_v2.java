package ch5;

import java.io.*;
import java.util.*;

public class Num3_v2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int pos : moves) {
            for(int i = 0; i < board.length; i++) { // 2차원 배열의 행 크기
                // 인형이 발견되었다면
                if(board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0; // 0으로 변경

                    // 스택의 상단과 비교 (peek 베서드)
                    if(!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else
                        stack.push(tmp);

                    // 계속해서 탐색하면 안됨
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Num3_v2 T = new Num3_v2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        // 2차원 배열로 board 판 구성
        int[][] board = new int[n][n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++)
            moves[i] = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(board, moves));
    }
}
