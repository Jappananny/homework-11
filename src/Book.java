import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author nameAuthor;
    private int yearBook;


    public Book(String nameBook, Author nameAuthor, int yearBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearBook = yearBook;
    }

    public String getNameBook() {

        return this.nameBook;
    }

    public String getNameAuthor() {
        return this.nameAuthor.toString();
        //this.nameAuthor.getFirstName() + " " + this.nameAuthor.getSecondName();
    }


    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {

        this.yearBook = yearBook;
    }

    @Override
    public String toString() {
        return "Название книги - " + getNameBook() + " Автор книги - " + nameAuthor.toString() + ". Дата издательства - " + getYearBook();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameBook);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && nameBook.equals(book.nameBook) && Objects.equals(nameAuthor, book.nameAuthor);
    }
}

