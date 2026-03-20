public class BookBST {

    private BSTNode root;

    public void insert(Book book) {
        root = insertRecursive(root, book);
    }

    private BSTNode insertRecursive(BSTNode node, Book book) {
        if (node == null) return new BSTNode(book);

        if (book.getISBN().compareTo(node.book.getISBN()) < 0) {
            node.left = insertRecursive(node.left, book);
        } else if (book.getISBN().compareTo(node.book.getISBN()) > 0) {
            node.right = insertRecursive(node.right, book);
        }

        return node;
    }

    public Book searchByISBN(String isbn) {
        BSTNode current = root;
        while (current != null) {
            int cmp = isbn.compareTo(current.book.getISBN());
            if (cmp == 0) return current.book;
            current = (cmp < 0) ? current.left : current.right;
        }
        return null;
    }
}
