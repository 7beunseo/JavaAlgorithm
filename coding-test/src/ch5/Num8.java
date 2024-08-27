package ch5;

import java.io.*;
import java.util.*;

// Person이라는 새로운 클래스를 만듦
class Person {
    int id;
    int pri;
    public Person(int id, int pri) {
        this.id = id;
        this.pri = pri;
    }
}

public class Num8 {

    public int solution(int n, int m, Queue<Person> queue) { // need와 plan으로 의미있는 변수명 짓기
        int id = -1, count = 0;
        while(id != m) { // m번이 빠지지 않았다면
            Person peek = queue.poll(); // 가장 앞 족에 있는 Person
            boolean flag = true;

            for(Person p : queue) {
                if(peek.pri < p.pri) {
                    flag = false;
                    break;
                }
            }
            if(flag) { // 앞 사람이 빠짐
                id = peek.id;
                count++;
            }
            else queue.offer(peek); // 다시 넣기
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Num8 T = new Num8();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Person> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int pri = Integer.parseInt(st.nextToken());
            queue.offer(new Person(i, pri));
        }

        System.out.println(T.solution(n, m, queue));
    }
}