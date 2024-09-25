package collictionn.misol1.Misol2;

import java.util.*;

public class Names1 {
    public static void main(String[] args) {
        List<String> names1=new ArrayList<>();
        names1.add("Javlon");
        names1.add("BEGZOD");
        names1.add("ALI");
        names1.add("Vali");
        names1.add("Doniyor");
        names1.add("BEGZOD");
        names1.add("Latif");
        names1.add("Zohid");
        names1.add("Shahboz");
        names1.add("Baxodir");
        names1.add("Latif");
        names1.add("Asadbek");
        names1.add("Nurbek");
        names1.add("Umar");

        Set<String> elements=new HashSet<>(names1);
        Iterator<String> iterator= elements.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
