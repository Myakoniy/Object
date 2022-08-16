public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("Джордан", "Питерсон");
        Author author2 = new Author("Дмитрий", "Глуховский");

        Book book1 = new Book("12 правил жизни", 2018, author1);
        Book book2 = new Book("Метро 2033", 2005, author2);

        System.out.println("Имя автора " + author1.getFirstName() + ", фамилия автора "+ author1.getSurname());
        System.out.println("Имя автора " + author2.getFirstName() + ", фамилия автора "+ author2.getSurname());

        System.out.println("Название книги: " + book1.getName() + ", год издания: " + book1.getYear() + ", автор книги: "+ author1.getFullName());
        System.out.println("Название книги: " + book2.getName() + ", год издания: " + book2.getYear() + ", автор книги: "+ author2.getFullName());

        book1.setYear(1986);
        System.out.println("Новый год издания: "+ book1.getYear());
    }
}