public class Book {

    int yearbook;
    String authorName, bookName;


    public Book(String authorName, String bookName, int yearbook) {
        this.authorName = authorName;
        this.yearbook = yearbook;
        this.bookName = bookName;
    }

    public String getFirstName() {
        return authorName;
    }

    public int getYearbook() {
        return yearbook;
    }

    public void setYearbook(int yearbook) {
        this.yearbook = yearbook;
    }


}
