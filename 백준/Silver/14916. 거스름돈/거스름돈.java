import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(true){
            if(n % 5 == 0){
                sum += n/5;
                break;
            }
            else{
                n -= 2;
                sum++;
            }
            if(n < 0) {
                sum = -1;
                break;
            }

        }
        System.out.println(sum);
        br.close();
    }
}