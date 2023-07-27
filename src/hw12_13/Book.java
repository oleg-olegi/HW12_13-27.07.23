package hw12_13;

public class Book {
    private String title;
    private Author authorName;
    private int dateOfPublishing;


    public Book(String title, Author authorName, int dateOfPublishing) {
        this.title = title;
        this.authorName = authorName;
        this.dateOfPublishing = dateOfPublishing;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getDateOfPublishing() {
        return this.dateOfPublishing;
    }

    public void setDateOfPublishing(int year) {
        this.dateOfPublishing = year;
    }

    @Override
    public String toString() {
        return "Навание книги - " + this.title + ";\n" +
                this.authorName.toString() + ";\n" +
                "Год публикации " + this.dateOfPublishing + ";\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Book a = (Book) obj;
        return title.equals(a.title) && authorName.equals(a.authorName) && dateOfPublishing == a.dateOfPublishing;
    }
}
