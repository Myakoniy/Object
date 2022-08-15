public class Main {


    public static void main(String[] args) {

        Author gluhovskiy = new Author("Dmitriy", "Gluhovskiy");
        Author piterson = new Author("Джордан", "Питерсон");

        Book metro = new Book("Dmitriy Gluhovskiy ", "metro ", 2005);
        Book pravila = new Book("Джордан Питерсон ", "12 правил жизни ", 2018);

        pravila.setYearbook(2019);
        System.out.println("Книга = " + pravila.bookName + pravila.authorName + pravila.yearbook);
    }
}