import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char arr[][] = new char[5][];
        int maxLen = 0;
        for(int i = 0; i < 5; i++) {
            char[] input = br.readLine().toCharArray();
            arr[i] = new char[input.length];
            for(int j = 0; j < input.length; j++)
                arr[i][j] = input[j];

            if(maxLen < input.length) maxLen = input.length;
        }
        for(int i = 0; i < maxLen; i++) {
            for(int k = 0; k < 5; k++)
                try {
                    sb.append(arr[k][i]);
                }catch(Exception e) {

                }
        }
        System.out.println(sb);
        br.close();
    }
}