import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        m += d;
        if(m / 60 > 0){
            int total_h = m/60;
            m -= total_h * 60;
            h += total_h;
            if(h >= 24)
                h -= 24;
        }
        System.out.println(h+" "+m);
    }
}