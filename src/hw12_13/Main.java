package hw12_13;

public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Ivan", "Turgenev");
        Author gogol = new Author("Nikolai", "Gogol");

        Book mumu = new Book("MuMu", turgenev, 1854);
        Book vii = new Book("Вий", gogol, 1010);

        mumu.setDateOfPublishing(2025);
        System.out.println(mumu.getDateOfPublishing());

        System.out.println(turgenev.getAuthor());
        mumu.printBook();
    }
}
