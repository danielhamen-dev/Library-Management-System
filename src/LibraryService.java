public class LibraryService {

    private BookBST bst = new BookBST();
    private AvailabilityTable availabilityTable = new AvailabilityTable();

    public void addBook(Book book) {
        bst.insert(book);
        availabilityTable.put(book.getISBN(), book.isAvailable());
    }

    public Book searchBook(String isbn) {
        return bst.searchByISBN(isbn);
    }

    public boolean borrowBook(String isbn) {
        Boolean available = availabilityTable.get(isbn);
        if (available == null || !available) return false;

        Book book = bst.searchByISBN(isbn);
        if (book != null) {
            book.setAvailable(false);
            availabilityTable.update(isbn, false);
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = bst.searchByISBN(isbn);
        if (book != null) {
            book.setAvailable(true);
            availabilityTable.update(isbn, true);
            return true;
        }
        return false;
    }
}
