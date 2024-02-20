import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numList[] = new int[3];

        numList[0] = sc.nextInt();
        numList[1] = sc.nextInt();
        numList[2] = sc.nextInt();

        int count = 0;

        for(int i=0; i<3; i++){
            if(numList[i] == numList[(i + 1) % 3])
                count++;
        }

        if(count == 3) {
            System.out.println(10000 + numList[0] * 1000);
        }
        else if(count == 1){
            boolean res = numList[0] == numList[1] ? true : false;
            if(!res)
                res = numList[1] == numList[2] ? true : false;
            if(res)
                System.out.println(1000 + numList[1] * 100);
            else
                System.out.println(1000 + numList[2] * 100);
        }
        else{
            int max = 0;
            for(int num : numList) {
                if(max < num)
                    max = num;
            }
            System.out.println(max * 100);
        }

    }
}