package demo1_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        for (int i=1;i<=5;i++){
            q1.offer(i*11);
        }
        System.out.println(q1.peek());

        while(q1.size()!=0){
            int a = q1.poll();
            System.out.println("被删除的元素是："+a);
        }
        System.out.println(q1);
    }
}
