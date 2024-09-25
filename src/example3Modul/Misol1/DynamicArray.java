package example3Modul.Misol1;




public class DynamicArray {

    private int[] array;
    private int size;
    private int capacity;


    public DynamicArray() {
        this(10);
    }


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
    }


    public void add(int element) {
        if (size == capacity) {
            resize1();
        }
        array[size++] = element;
    }


    public void remove1(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


    public void remove2(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                remove1(i);
                return;
            }
        }
    }


    public int get2(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }


    public int get1(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }


    private void resize1() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        System.out.println(dynamicArray);

        dynamicArray.remove1(1);
        System.out.println(dynamicArray);

        dynamicArray.remove1(3);
        System.out.println(dynamicArray);

        System.out.println(dynamicArray.get1(0));
        System.out.println(dynamicArray.get1(1));

        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        System.out.println(dynamicArray);
    }
}

