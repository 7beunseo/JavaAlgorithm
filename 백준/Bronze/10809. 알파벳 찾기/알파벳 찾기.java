import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int arr[] = new int[26];
        for(int i = 0; i < 26; i++) {
            sb.append(str.indexOf('a'+i)).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}