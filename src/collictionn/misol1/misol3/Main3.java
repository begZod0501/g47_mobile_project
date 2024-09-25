package collictionn.misol1.misol3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        List<Book> books1=new ArrayList<>();

        books.add(new Book("Java"));
        books.add(new Book("Phyton"));
        books.add(new Book("HTML"));
        books.add(new Book("Go"));
        books.add(new Book("PHP"));
        books.add(new Book("C#"));
        books.add(new Book("JavaScript"));
        books.add(new Book("C++"));
        books.add(new Book(".Net"));
        for (int i = 0; i < 5; i++) {
            books1.add(books.get(new Random().nextInt(books.size())));
        }
        System.err.println(books);

        System.out.println();
        System.err.println(books1);
        System.out.println();
        books.removeAll(books1);
        System.out.println("books  ---> " + books);
        System.out.println("books1   ----> "+ books1);
    }
}
