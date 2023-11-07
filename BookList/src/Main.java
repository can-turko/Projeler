import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("book one",120,"Bella",new Date(1970,1,10));
        Book b2 = new Book("book two",90,"Maria",new Date(2001,12,20));
        Book b3 = new Book("book three",200,"John",new Date(2000,1,22));
        Book b4 = new Book("book four",720,"Kyle",new Date(2010,3,10));
        Book b5 = new Book("book five",300,"Gordon",new Date(1990,11,11));
        Book b6 = new Book("book six",30,"Lucas",new Date(1986,2,15));
        Book b7 = new Book("book seven",500,"Amy",new Date(1930,5,7));
        Book b8 = new Book("book eight",70,"Lisa",new Date(1999,12,10));
        Book b9 = new Book("book nine",200,"Leo",new Date(2024,2,3));
        Book b10 = new Book("book ten",32,"Isaac",new Date(1994,10,30));

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        ArrayList<Book> filt = new ArrayList<>();

        books.stream().filter(book -> book.getPage()>100).forEach(book -> filt.add(book));

        filt.stream().forEach(number -> System.out.println(number.getPage()));

    }
}