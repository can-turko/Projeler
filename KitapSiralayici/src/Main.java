import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book s1 = new Book("Cali kusu", 406, "Halide Edip Adıvar", "1999");
        Book s2 = new Book("Kumarbaz", 161, "Dostoyevski", "1999");
        Book s3 = new Book("Akumarbaz", 110, "Dostoyevski", "1999");
        Book s4 = new Book("Aakumarbaz", 200, "Dostoyevski", "1999");
        TreeSet<Book> h1 = new TreeSet<>(new Book());
        h1.add(s1);
        h1.add(s2);
        h1.add(s3);
        h1.add(s4);
        for(Book s : h1){
            System.out.println(s);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        TreeSet<Book> h2 = new TreeSet<Book>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageQuantity()-o2.getPageQuantity();
            }
        });
        h2.add(s1);
        h2.add(s2);
        h2.add(s3);
        h2.add(s4);
        for(Book s : h2){
            System.out.println(s);
        }
    }
}
