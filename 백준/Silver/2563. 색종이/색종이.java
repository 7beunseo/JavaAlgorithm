import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[][] = new int[100][100];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int k = x ; k < x + 10 ; k++) {
                for(int j = y ; j < y + 10 ; j++) {
                    if(arr[j][k] == 0) arr[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            for(int k = 0; k < 100; k++)
                sum += arr[i][k];
        }
        System.out.println(sum);
        br.close();
    }
}