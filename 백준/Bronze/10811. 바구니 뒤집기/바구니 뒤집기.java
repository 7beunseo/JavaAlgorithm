import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) arr[i] = i + 1;

        int num = Integer.parseInt(st.nextToken());
        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            int t = 0;
            for(int k = start; k <= (start + end ) / 2; k++){
                int temp = arr[k];
                arr[k] = arr[end - t];
                arr[end - t] = temp;
                t++;
            }
        }
        for(int i = 0; i < size; i++) sb.append(arr[i]).append(" ");
        System.out.println(sb);
        br.close();
    }
}