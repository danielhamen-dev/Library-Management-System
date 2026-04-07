import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {
        System.out.println("Library Management System");

        LibraryService lib = new LibraryService();
        ArrayList<Book> books = Common.getBooks();

        // populate LibraryService instance
        int cnt = 0;
        for (Book book : books) {
            lib.addBook(book);
            cnt++;
        }

        // log the books added
        System.out.printf(
            "Added %d books to the Library Management System\n",
            cnt
        );

        // start CLI
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Library Management CLI ===");
            System.out.println("1. Search Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Add Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": {
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    Book book = lib.searchBook(isbn);

                    if (book != null) {
                        System.out.println("Found:");
                        System.out.println(book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter ISBN to borrow: ");
                    String isbn = scanner.nextLine();

                    boolean success = lib.borrowBook(isbn);

                    if (success) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println(
                            "Book unavailable or does not exist."
                        );
                    }
                    break;
                }
                case "3": {
                    System.out.print("Enter ISBN to return: ");
                    String isbn = scanner.nextLine();

                    boolean success = lib.returnBook(isbn);

                    if (success) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                }
                case "4": {
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(isbn, title, author, true);
                    lib.addBook(newBook);

                    System.out.println("Book added successfully.");
                    break;
                }
                case "5": {
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                }
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
