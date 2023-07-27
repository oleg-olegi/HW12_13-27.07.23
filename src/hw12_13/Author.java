package hw12_13;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Author a = (Author) obj;
        return name.equals(a.name) && surname.equals(a.surname);

    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

    @Override
    public String toString() { //переопределение toSring
        return "Имя автора - " + this.name + " " + "\nФамилия автора - " + this.surname;
    }
}