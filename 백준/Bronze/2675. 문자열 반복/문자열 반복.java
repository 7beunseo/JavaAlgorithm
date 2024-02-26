import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int k = 0; k < str.length(); k++) {
                for(int j = 0; j < num; j++)
                    sb.append(str.charAt(k));
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}