import java.util.Date;

public class Book {
    private String name;
    private int page;
    private String authorName;
    private Date publish;

    public Book(){

    }

    public Book(String name, int page, String authorName, Date publish) {
        this.name = name;
        this.page = page;
        this.authorName = authorName;
        this.publish = publish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }
}
