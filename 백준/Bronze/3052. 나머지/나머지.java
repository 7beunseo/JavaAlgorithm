import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10];

        for(int i = 0; i < 10; i++) arr[i] = Integer.parseInt(br.readLine()) % 42;
        List<Integer> count = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            if (!count.contains(arr[i])) // 값이 들어있는지 확인
                count.add(arr[i]);
        }
        System.out.println(count.size());
        br.close();
    }
}