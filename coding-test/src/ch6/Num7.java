package ch6;

import java.io.*;
import java.util.*;

class Point implements Comparable<Point> { // Point 객체를 정렬하는 Comparable 구현
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p){
        if(this.x == p.x) {
            return  this.y - p.y; // 작은 값이 정렬되려먼 음수 값이 러턴되어야 함
        }
        return this.x - p.x;
    }

}

public class Num7 {
    public String solution(int n, int[][] points) {
        return null;

    }

    public static void main(String[] args) throws IOException {
        Num7 T = new Num7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Point> points = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            points.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(points);
        StringBuilder sb = new StringBuilder();

        points.forEach(point -> sb.append(point.x).append(" ").append(point.y).append("\n"));
        System.out.println(sb);
    }
}
