import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalSum = 0;
        double gradeSum = 0;
        for(int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double grade = Double.parseDouble(input[1]);
            String stringScore = input[2];
            double numScore = 0;
            switch(stringScore) {
                case "A+" : numScore = 4.5; break;
                case "A0" : numScore = 4.0; break;
                case "B+" : numScore = 3.5; break;
                case "B0" : numScore = 3.0; break;
                case "C+" : numScore = 2.5; break;
                case "C0" : numScore = 2.0; break;
                case "D+" : numScore = 1.5; break;
                case "D0" : numScore = 1.0; break;
                case "F" : numScore = 0;  break;
            }
            if (!stringScore.equals("P")) {
                gradeSum += grade;
                totalSum += (grade * numScore);
            }
        }
        if(gradeSum == 0) System.out.printf("%.6f", 0.000000);
        else System.out.printf("%.6f", totalSum / gradeSum);
        br.close();
    }
}