package QueueImplemitatsiya.Lesson6Misol2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
        public static void main(String[] args) {

//            Comparator<User> userComparator = new Comparator<User>() {
//                @Override
//                public int compare(User u1, User u2) {
//                    // Name bo'yicha tartiblanadi (alfavit bo'yicha)
//                    return u1.name.compareTo(u2.name);
//                }
//            };
            Comparator<User> userComparator = (u1, u2) -> u1.name.compareTo(u2.name);


            PriorityQueue<User> priorityQueue = new PriorityQueue<>(userComparator);
            priorityQueue.add(new User("Alice", "12345"));
            priorityQueue.add(new User("Bob", "67890"));
            priorityQueue.add(new User("Charlie", "23456"));


            System.out.println("PriorityQueue elementlari:");
            for (User user : priorityQueue) {
                System.out.println(user);
            }


            System.out.println(" natija: " + priorityQueue.peek());


            System.out.println(" natija: " + priorityQueue.poll());


            System.out.println(" PriorityQueue elementlari:");
            for (User user : priorityQueue) {
                System.out.println(user);
            }
        }
    
}
