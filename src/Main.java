public class Main {

    public static void printBook (Book book) {
        String bookTitleBook = book.getTitleBook();
        String bookAuthorName = book.getAuthor().getName();
        String bookAuthorSurname = book.getAuthor().getSurname();
        int bookYearPublication = book.getYearPublication();
        System.out.println("Название книги - "+bookTitleBook+", автор книги - "+bookAuthorName+" "+bookAuthorSurname+", год издания - "+bookYearPublication);
    }

    public static void main(String[] args) {
        Author oneginAuthor = new Author("Александр","Пушкин");
        Book onegin = new Book("Евгений Онегин", new Author(oneginAuthor.getName(), oneginAuthor.getSurname()), 2012);
        onegin.setYearPublication(2020);
        printBook(onegin);

        Author mtsiriAuthor = new Author("Михаил", "Лермонтов");
        Book mtsiri = new Book("Мцыри", new Author(mtsiriAuthor.getName(), mtsiriAuthor.getSurname()), 1999);
        printBook(mtsiri);

    }
}