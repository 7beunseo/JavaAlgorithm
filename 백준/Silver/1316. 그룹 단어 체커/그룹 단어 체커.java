import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            int pos;
            int j;
            for(j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if((pos = str.indexOf(ch, j+1)) != -1) {
                    if(j + 1 != pos) break;
                }
            }
            if(j == str.length()) count++;
        }
        System.out.println(count);
        br.close();
    }
}