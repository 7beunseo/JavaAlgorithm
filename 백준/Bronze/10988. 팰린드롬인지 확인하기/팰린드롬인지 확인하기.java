import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while(lt < rt) {
            if (c[lt] != c[rt])
                break;
            lt++;
            rt--;
        }
        if (lt < rt) System.out.println(0);
        else System.out.println(1);
        br.close();
    }
}