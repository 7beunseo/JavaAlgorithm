import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = new StringBuilder(st.nextToken()).reverse().toString();
        int b = Integer.parseInt(st.nextToken());

        int square = 0;
        int sum = 0;
        for(char c : str.toCharArray()) {
            int num;
            if (Character.isDigit(c)) num = (int)c - '0';
            else num = c - 'A' + 10;
            sum += Math.pow(b, square) * num;
            square++;
        }
        System.out.println(sum);
        br.close();
    }
}