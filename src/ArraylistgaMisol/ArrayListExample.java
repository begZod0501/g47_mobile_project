package ArraylistgaMisol;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args)  {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Peter");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator);
        }













//
//        int[] arrray=new int[5];
//        Random random=new Random();
//
//        for (int i = 0; i < arrray.length; i++) {
//            arrray[i]= random.nextInt(100)+1;
//
//        }
//        ArrayList<Integer> linkedList=new ArrayList<>();
//        for (int i = 0; i < arrray.length; i++) {
//            if(arrray[i]%2!=1){
//               linkedList.add(arrray[i]);
//            }
//        }
//        System.out.println(linkedList);
//
//



        //        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Messi");
//        hashSet.add("Neymar");
//        hashSet.add("Suares");
//        System.out.println("Hash set --->" + hashSet);
//
//        Thread.sleep(2000);
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("Messi");
//        linkedHashSet.add("Neymar");
//        linkedHashSet.add("Suares");
//        linkedHashSet.add("Suares");
//        System.out.println("LinkedHashSet ----> " + linkedHashSet);
//
//        Thread.sleep(3000);
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("Messi");
//        treeSet.add("Neymar");
//        treeSet.add("Suares");
//        treeSet.add("Messi");
//        treeSet.add("Artur");
//        System.out.println("TreeSet---> " + treeSet);
//

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Messi");
//        arrayList.add("Neymay");
//        arrayList.add("Suares");
//        arrayList.add("Dybala");
//        arrayList.add("Dybala");
//        System.out.println(arrayList);
//
//        LinkedList<String> linkedList=new LinkedList<>();
//        linkedList.add("Dybala");
//        linkedList.add("Suares");
//        linkedList.add("Neymar");
//        linkedList.add("Messi");
//        linkedList.add("Neymar");
//        System.out.println(linkedList);


//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Olma");
//        fruits.add("Banana");
//        fruits.add("Apilsen");
//        System.out.println("Fruit ----> " + fruits);
//
//        String firstFruit = fruits.get(0);
//        System.out.println("Birinchi meva ----> " + firstFruit);
//
//        fruits.set(1, "Kivi");
//        System.out.println("Yangilangan mevalar ruyhati ----> " + fruits);
//
//        fruits.remove(2);
//        System.out.println("Apilsin o'chirildi--- >" + fruits);
//
//        int size = fruits.size();
//        System.out.println("Arrrayni uzunligi ---->" + size);
//
//        fruits.clear();
//        System.out.println("xamma elimentlar o'cjirildi ---->" + fruits);
//

    }

}



