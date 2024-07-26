import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String splitStr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            int k;
            for(k = 0; k < splitStr.length; k++) {
                if (str.startsWith(splitStr[k], i)) {
                    i += splitStr[k].length() - 1;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
        br.close();
    }
}