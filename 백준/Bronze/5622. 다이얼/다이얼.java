import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int totalTime = 0;
        for(char x : num.toCharArray()) {
            if ( x == 'W' || x == 'X' || x == 'Y' || x == 'Z') totalTime += 10;
            else if ( x == 'T' || x == 'U' || x == 'V') totalTime += 9;
            else if (x == 'S') totalTime += 8;
            else {
                x -= 'A';
                totalTime += x/3 + 3;
            }
        }
        System.out.println(totalTime);
        br.close();
    }
}