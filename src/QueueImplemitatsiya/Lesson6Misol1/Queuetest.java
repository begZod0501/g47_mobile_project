package QueueImplemitatsiya.Lesson6Misol1;

import java.util.LinkedList;
import java.util.Queue;

public class Queuetest {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 1; i <=10 ; i++) {
            queue.add(i);

        }
        System.out.println("Queue---> " + queue);

        queue.poll();
        queue.add(100);
        System.out.println(" Birinchi son remove qilingandan kiyingi holat "+queue);
    }


}


