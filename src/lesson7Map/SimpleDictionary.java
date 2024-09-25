package lesson7Map;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

/**
 * Created by: Mehrojbek
 * DateTime: 16/08/24 19:48
 **/
public class SimpleDictionary<K, V> {

    private static final int DEFAULT_CAPACITY = 10;
    private Entry<K, V>[] entries;
    private int size = 0;

    public static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " => " + value;
        }
    }

    @SuppressWarnings("unchecked")
    public SimpleDictionary(int capacity) {
        this.entries = new Entry[capacity];
    }

    @SuppressWarnings("unchecked")
    public SimpleDictionary() {
        this(DEFAULT_CAPACITY);
    }

    public boolean remove(K key){
        //todo yozish kerak
        return false;
    }

    public Set<K> keys(){
        //todo
        return null;
    }

    public Collection<V> values(){
        //todo
        return null;
    }

    public V put(K key, V value) {

        if (size >= entries.length) {
            //todo razmerni oshir
        }

        int hashCode = Objects.hashCode(key);

        int index = hashCode % entries.length;

        //capacity -> 10
        //hashcode -> 112 -> 2 index->2

        Entry<K, V> oldEntry = entries[index];

        if (oldEntry == null) {
            entries[index] = new Entry<>(key, value);
            size++;
            return value;
        }

        if (oldEntry.key.equals(key)) {
            V oldValue = oldEntry.value;
            oldEntry.value = value;
            return oldValue;
        }

        //13: Test1, 43: Qo'y, null

        Entry<K, V> currentEntry = oldEntry;

        while (currentEntry.next != null) {
            currentEntry = currentEntry.next;
            if (Objects.equals(currentEntry.key,key)){

                //43: Qo'y -> 43: Echki
                //43: Echki
                V oldValue = currentEntry.value;
                currentEntry.value = value;
                return oldValue;
            }
        }

        currentEntry.next = new Entry<>(key, value);
        size++;
        return value;
    }

    public V get(K key) {
        int hashCode = Objects.hashCode(key);
        int index = hashCode % entries.length;

        Entry<K, V> entry = entries[index];
        if (Objects.isNull(entry))
            return null;

        if (Objects.equals(key, entry.key))
            return entry.value;

        if (Objects.isNull(entry.next))
            return null;

        Entry<K, V> current = entry.next;

        while (Objects.nonNull(current) && !Objects.equals(current.key, key)) {
            current = current.next;
        }

        if (Objects.isNull(current))
            return null;

        return current.value;
    }

    @Override
    public String toString() {

        StringJoiner stringJoiner = new StringJoiner(",", "{", "}");

        for (Entry<K, V> entry : entries) {
            if (Objects.nonNull(entry)) {
                stringJoiner.add(entry.toString());

                Entry<K,V> currentEntry = entry.next;

                while (currentEntry != null) {
                    stringJoiner.add(currentEntry.toString());
                    currentEntry = currentEntry.next;
                }
            }
        }

        return stringJoiner.toString();
    }

    public static void main(String[] args) {
        SimpleDictionary<Integer, String> intMap = new SimpleDictionary<>();

        intMap.put(1, "Mushuk");
        intMap.put(2, "It");
        intMap.put(3, "Ot");
        intMap.put(13, "Kit");
        intMap.put(33, "Sigir");
        intMap.put(43, "Qo'y");
//        System.out.println("intMap.put(43, \"Echki\") = " + intMap.put(43, "Echki"));
//
//        System.out.println("intMap = " + intMap);
//        System.out.println("intMap.size = " + intMap.size);
//
//        String s = intMap.get(2);
//        System.out.println("s = " + s);
//
//        String s1 = intMap.get(43);
//        System.out.println("s1 = " + s1);

//        String str1 = "Aa";//65,97 -
//        String str2 = "BB";
//
//        System.out.println("Hash code of 'Aa': " + str1.hashCode());
//        System.out.println("Hash code of 'BB': " + str2.hashCode());


        SimpleDictionary<Student, String> studentMap = new SimpleDictionary<>();
        studentMap.put(new Student("Ali"),"1");
        studentMap.put(new Student("VAli"),"2");
        studentMap.put(new Student("Salim"),"3");
        studentMap.put(new Student("Halim"),"4");
        studentMap.put(new Student("Halim"),"5");

        System.out.println(studentMap);

    }

    public static class Student{
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}

