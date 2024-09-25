package QueueImplemitatsiya.Misol3;



import java.util.Arrays;
import java.util.Comparator;

public class MyPriorityQueue<T> {
    private Object[] elements;
    private int size = 0;
    private Comparator<T> comparator;

    public MyPriorityQueue(int size) {
        this(size, null);
    }

    public MyPriorityQueue(int size, Comparator<T> comparator) {
        elements = new Object[size];
        this.comparator = comparator;
    }

    @SuppressWarnings("unchecked")
    public boolean offer(T element) {
        if (isFull())
            throw new RuntimeException("PriorityQueue is full");
        int i;
        for (i = size - 1; i >= 0; i--) {
            if (comparator != null) {
                if (comparator.compare((T) elements[i], element) > 0) {
                    elements[i + 1] = elements[i];
                } else {
                    break;
                }
            } else {
                Comparable<? super T> currentElement = (Comparable<? super T>) elements[i];
                if (currentElement.compareTo(element) > 0) {
                    elements[i + 1] = elements[i];
                } else {
                    break;
                }
            }
        }
        elements[i + 1] = element;
        size++;
        return true;
    }

    public boolean poll() {
        if (isEmpty())
            throw new RuntimeException("PriorityQueue is empty");

        elements[0] = null;
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;

        return true;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty())
            throw new RuntimeException("PriorityQueue is empty");
        return (T) elements[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "elements=" + Arrays.toString(Arrays.copyOf(elements, size)) +
                '}';
    }
}

