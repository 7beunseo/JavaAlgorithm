import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            char start = str.charAt(0);
            char end = str.charAt(str.length() -1);
            sb.append(start).append(end).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}