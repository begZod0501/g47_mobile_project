package collictionn.misol1.misol3;

public class Book {
    private String Title;

    public Book(String title) {
        this.Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                '}';
    }
}
