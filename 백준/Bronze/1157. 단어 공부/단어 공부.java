import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int arr[] = new int[26];
        for(char c : str.toCharArray()) arr[c-'A']++;
        int max = 0;
        int res = '?';
        for(int i = 0; i < 26; i++) {
            if(max < arr[i]) {
                max = arr[i];
                res = i + 'A';
            }
            else if(max != 0 && max == arr[i]) {
                res = '?';
            }
        }

        System.out.println((char)res);
        br.close();
    }
}