import java.util.Objects;

public class BookService {
    public Book yearBook;

    //Хотел сделать сравнение по году книг переведеным в хешкод...но что-то пошло не так и я только запутал себя еще сильней(
    @Override
    public boolean equals(Object year) {
        if (this == year) return true;
        if (year == null || getClass() != year.getClass()) return false;
        BookService that = (BookService) year;
        return yearBook.equals(that.yearBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearBook);
    }
}
