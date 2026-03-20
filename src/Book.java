public class Book {

    private String bookISBN; // international something book number
    private String bookTitle;
    private String bookAuthor;
    private boolean bookAvailable;

    public Book(
        String bookISBN,
        String bookTitle,
        String bookAuthor,
        boolean bookAvailable
    ) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookAvailable = bookAvailable;
    }

    /** returns book isbn number as string */
    public String getISBN() {
        return bookISBN;
    }

    /** return book title */
    public String getTitle() {
        return bookTitle;
    }

    /** return book author */
    public String getAuthor() {
        return bookAuthor;
    }

    /** return whether or not the book is available */
    public boolean isAvailable() {
        return bookAvailable;
    }

    /** sets the availability of the book */
    public void setAvailable(boolean available) {
        this.bookAvailable = available;
    }

    // override toString() class for testing and demonstration later
    @Override
    public String toString() {
        return (
            "Book{" +
            "isbn='" +
            bookISBN +
            '\'' +
            ", title='" +
            bookTitle +
            '\'' +
            ", author='" +
            bookAuthor +
            '\'' +
            ", available=" +
            bookAvailable +
            '}'
        );
    }
}
