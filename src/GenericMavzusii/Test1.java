package GenericMavzusii;

public class Test1 {
    public <b> void print(b[] a){
        //System.out.println(a);
        for (b gfs: a) {
            System.out.println(gfs);
        }
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
//        test1.print(1233d);
//        test1.print("BARSELONA");
//        test1.print(134);
        Integer[] arr={1,2,344,54,66,6};
        String[] arr2={"ee","twt","tgr"};
           test1.print(arr);
           test1.print(arr2);
    }
}
