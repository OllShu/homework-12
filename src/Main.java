public class Main {

    public static void main(String[] args) {
        Author oneginAuthor = new Author("Александр","Пушкин");
        Book onegin = new Book("Евгений Онегин", new Author(oneginAuthor.getName(), oneginAuthor.getSurname()), 2012);
        System.out.println("Название книги - "+onegin.getTitleBook()+", автор книги - "+oneginAuthor.getName()+" "+oneginAuthor.getSurname()+", год издания - "+onegin.getYearPublication());
        //System.out.println("onegin.yearOfPublication = "+onegin.yearPublication);
    }
}