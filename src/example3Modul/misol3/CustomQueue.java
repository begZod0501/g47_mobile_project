package example3Modul.misol3;

public class CustomQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;


    public CustomQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }


    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        queue[rear] = element;
        rear = (rear + 1) % capacity;
    }


    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        return element;
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = front; i != rear; i = (i + 1) % capacity) {
            sb.append(queue[i]).append(", ");
        }
        sb.append(queue[rear]).append("]");
        return sb.toString();
    }


    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }


    public boolean isEmpty() {
        return front == rear;
    }


}
