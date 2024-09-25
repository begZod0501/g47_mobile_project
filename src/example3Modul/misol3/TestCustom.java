package example3Modul.misol3;

public class TestCustom {
    public static void main(String[] args) {

            CustomQueue queue = new CustomQueue(5);
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            System.out.println(queue);

            System.out.println(queue.dequeue());
            System.out.println(queue);

            System.out.println(queue.peek());

            queue.enqueue(4);
            queue.enqueue(5);
            System.out.println(queue);

            queue.enqueue(6);
            System.out.println(queue);

    }
}
