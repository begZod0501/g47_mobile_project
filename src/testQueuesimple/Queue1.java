package testQueuesimple;


import java.util.Arrays;

public class Queue1<E> {

    private Object[] elements;
    private int elementCount = 0;
    private int front = 0;
    private int rear = -1;
    private int capacity;

    // Constructor, maksimal sig'imni qabul qiladi
    public Queue1(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    // Elementni queue'ga qo'shish
    public boolean enqueue(E element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        elements[rear] = element;
        elementCount++;
        return true;
    }

    @SuppressWarnings("unchecked")
    // Elementni queue'dan olib tashlash
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E element = (E) elements[front];
        elements[front] = null; // Garbage collector'ga yordam berish
        front = (front + 1) % capacity;
        elementCount--;
        return element;
    }

    // Queue to'ldirilganligini tekshirish
    private boolean isFull() {
        return elementCount == capacity;
    }

    // Queue bo'sh yoki yo'qligini tekshirish
    private boolean isEmpty() {
        return elementCount == 0;
    }

    @Override
    public String toString() {
        return "Queue1{" +
                "elements=" + Arrays.toString(elements) +
                ", elementCount=" + elementCount +
                '}';
    }

    // Main metodini alohida sinfda joylash
    public static void main(String[] args) {
        // Queue yaratamiz va maksimal sig'imini 10 qilib belgilaymiz
        Queue1<Integer> queue = new Queue1<>(10);

        // Elementlarni queue'ga qo'shamiz
        queue.enqueue(1);
        queue.enqueue(2);

        // Queue'ni konsolga chiqaramiz
        System.out.println(queue);

        // Elementlarni olib tashlaymiz
        System.out.println("Olib tashlangan element: " + queue.dequeue());
        System.out.println(queue);
    }

















//    Object[] elements;
//    int elementCount=0;
//
//    public Queue1(int capacity) {
//        this.elements = new Object[elementCount];
//    }
//
//    public boolean enqueue(E a){
//        if (isFull()) {
//            throw new RuntimeException("Queue is full");
//        }
//
//
//        elements[elementCount]=a;
//        elementCount++;
//        return true;
//
//    }
//
//    private boolean isFull() {
//    return elementCount==elements.length;
//    }
//    @SuppressWarnings("unchecked")
//    public E dequeue(){
//        if (isEmpty())
//            throw new RuntimeException("Queue is empty");
//   E element= (E ) elements[0];
//        for (int i = 0; i < elements.length-1; i++) {
//   elements[i]=elements[i+1];
//   elementCount--;
//        }
//        return element;
//
//    }
//
//    private boolean isEmpty() {
//    return elementCount==0;
//    }
//
//    @Override
//    public String toString() {
//        return "Queue1{" +
//                "elements=" + Arrays.toString(elements) +
//                ", elementCount=" + elementCount +
//                '}';
//    }
//    public class SimpleQueue<E> {
//        public static void main(String[] args) {
//            testQueuesimple.SimpleQueue<Integer> integerSimpleQueue=new testQueuesimple.SimpleQueue<>(10);
//            integerSimpleQueue.enqueue(1);
//            integerSimpleQueue.enqueue(2);
//            System.out.println(integerSimpleQueue);
//        }
    }

