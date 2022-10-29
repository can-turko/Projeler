import java.util.Comparator;

public class Book implements Comparator<Book> {
    private String name;
    private int pageQuantity;
    private String authorName;
    private String releaseDate;
    Book(){}
    Book(String name, int pageQuantity, String authorName, String releaseDate){
        this.name=name;
        this.pageQuantity=pageQuantity;
        this.authorName=authorName;
        this.releaseDate=releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageQuantity=" + pageQuantity +
                '}';
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
