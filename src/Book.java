import java.util.SplittableRandom;

public class Book {
    String nameBook;
    Author nameAuthor;
    private int yearBook;
    public Book(String nameBook, Author nameAuthor, int yearBook) {
        this.nameBook=nameBook;
        this.nameAuthor=nameAuthor;
        this.yearBook=yearBook;
    }
    public String getNameBook() {
        return  this.nameBook;
    }
    public String getNameAuthor() {
        return this.nameAuthor.firstName+" "+this.nameAuthor.secondName;

    }
    public int getYearBook(){
        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook=yearBook;

    }

}

