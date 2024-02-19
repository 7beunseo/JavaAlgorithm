import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int first = B / 100;
        int second = (B % 100) / 10;
        int third = B % 10;
        
        int top1 = A * third;
        int top2 = A * second;
        int top3 = A * first;
        
        int top4 = top1 + top2 * 10 + top3 * 100;
        
        System.out.println(top1);
        System.out.println(top2);
        System.out.println(top3);
        System.out.println(top4);
        
    }
}