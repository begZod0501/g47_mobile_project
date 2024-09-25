package simpleQueue;


import java.util.LinkedList;
import java.util.Queue;


public class testSimpleQueue {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();


        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");


        System.out.println("Queue dastlabki holatda: " + queue);


        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());


        System.out.println("Queue oxirgi holatda: " + queue);

if (queue.isEmpty())
        try {
            System.out.println("Peek: is impty");
        } catch (Exception e) {
            System.out.println("Queue bo'sh, element yo'q.");
        }
    }
}


