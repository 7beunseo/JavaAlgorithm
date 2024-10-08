import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a, b;
        String input;
        while((input = br.readLine()) != null) {
            a = (input.charAt(0) - 48 );
            b = (input.charAt(2) - 48 );
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}