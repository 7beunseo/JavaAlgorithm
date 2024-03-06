import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        int xw = x - w > 0 ? x - w : w - x;
        int yh = y - h > 0 ? y - h : h - y;
        arr.add(xw);
        arr.add(yh);
        arr.add(x);
        arr.add(y);
        System.out.println(Collections.min(arr)); // 컬렉션으로 최소 구함
        br.close();
    }
}