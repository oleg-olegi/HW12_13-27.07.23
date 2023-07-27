package hw12_13;

public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Ivan", "Turgenev");
        Author gogol = new Author("Nikolai", "Gogol");

        Book mumu = new Book("Муму", turgenev, 1854);
        Book vii = new Book("Вий", gogol, 1010);

        System.out.println(gogol.toString());
        System.out.println(mumu.toString());
    }
}
