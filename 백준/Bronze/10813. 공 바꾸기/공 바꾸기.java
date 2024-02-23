import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = i + 1;
        }
        
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int switch1 = Integer.parseInt(st.nextToken());
            int switch2 = Integer.parseInt(st.nextToken());
            
            int temp = arr[switch1 - 1];
            arr[switch1 - 1] = arr[switch2 - 1];
            arr[switch2 - 1] = temp;
        }
        
        for(int n : arr) {
            sb.append(n).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
}