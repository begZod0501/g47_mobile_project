package example3Modul.Misol2;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        size--;
    }


    public void removeElement(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                size--;
                return;
            }
            current = current.next;
        }
    }


    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    public int getElement(int data) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        throw new IllegalArgumentException("Element not found in the list");
    }


    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }


    public void forEach() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(19);
        list.add(17);
        list.add(76);
        list.add(64);
        list.add(78);
        list.add(86);
        list.add(87);

        System.out.println("Ro'yxat: " + list.toString());

        list.remove(1);
        System.out.println("1-indeksdan o'chirgandan keyin: " + list.toString());

        list.removeElement(76);
        System.out.println("76 elementini o'chirgandan keyin: " + list.toString());

        System.out.println("0-indeksdagi element: " + list.get(0));

        System.out.println("Element 86 ning indeksi: " + list.getElement(86));

        System.out.print("Ro'yxatni foreach orqali: ");
        list.forEach();
    }
}
