package lesson2GitHub;

public class GenericMethod {
    public static <R extends Comparable<R>> int compare(R a, R b){
        return a.compareTo(b);
    }
    public static void main(String[] args){
        Integer num1=23;
        Integer num2=23;
        System.out.println(compare(num1,num2));


        String str1="Hello";
        String str2="Student";
        System.out.println(compare(str1,str2));
    }
}
