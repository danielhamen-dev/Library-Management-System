public class Benchmark {

    public static void main(String[] args) {
        int[] sizes = { 10, 100, 1000, 5000, 10000 };

        for (int n : sizes) {
            LibraryService lib = new LibraryService();

            for (int i = 0; i < n; i++) {
                String isbn = String.format("%013d", i);
                Book book = new Book(isbn, "Book " + i, "Author " + i, true);
                lib.addBook(book);
            }

            String targetISBN = String.format("%013d", n / 2);

            // warmup
            for (int i = 0; i < 1000; i++) {
                lib.searchBook(targetISBN);
            }

            long total = 0;
            int trials = 10000;

            for (int i = 0; i < trials; i++) {
                long start = System.nanoTime();
                lib.searchBook(targetISBN);
                long end = System.nanoTime();
                total += (end - start);
            }

            long average = total / trials;
            System.out.println(n + "," + average);
        }
    }
}
