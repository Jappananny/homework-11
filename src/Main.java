public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        Author author = new Author("Андуин", "Рин");
        Author author1 = new Author("Типичный рейдер", "Зимакс");
        Book book = new Book("Как управлять овцами в рейде", author, 2022);
        book.setYearBook(1854);
        Book book1 = new Book("Вайп на Зимаксе или взгляд со стороны", author1, 2022);
        //System.out.println("Название книги - " + book.getNameBook() + " Автор книги - " + book.getNameAuthor() + ". Дата издательства - " + book.getYearBook());
        //System.out.println("Название книги - " + book1.getNameBook() + " Автор книги - " + book1.getNameAuthor() + ". Дата издательства - " + book1.getYearBook());
        System.out.println(book.equals(book1));
        System.out.println(book.hashCode());
    }

}