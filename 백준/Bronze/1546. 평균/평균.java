import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double max = 0;
        double sum = 0;
        double arr[] = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) max = arr[i];
        }
        for(int i = 0; i < n; i++) sum += (arr[i] / max )* 100.0;
        System.out.println(sum / n);

        br.close();
    }
}