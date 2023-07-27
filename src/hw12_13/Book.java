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

    public void printBook() {
        System.out.println("Назание " + title);
        System.out.println("Автор " + authorName.getAuthor());
        System.out.println("Год публикации " + dateOfPublishing);
    }
}
