public class Book {
    private String titleBook;
    private Author author;
    private int yearPublication;

        public Book (String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = new Author(author.getName(), author.getSurname());
        this.yearPublication = yearPublication;

    }
    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}


