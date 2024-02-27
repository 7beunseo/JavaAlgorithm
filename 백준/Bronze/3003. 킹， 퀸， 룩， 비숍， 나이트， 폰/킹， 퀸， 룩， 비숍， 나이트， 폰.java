import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int chess[] = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < 6; i++) sb.append(chess[i] - input[i]).append(" ");
        System.out.println(sb);
        br.close();
    }
}