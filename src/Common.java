import java.util.ArrayList;

public class Common {

    /**
     * To create this function I used AI to automate
     * ArrayList node population.
     */
    public static ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<Book>();

        /*
                The following code chunk was written by ChatGPT version 5.2
                using the prompt:
                """
                Write Java code populating an ArrayList class with 100 entries using the
                following the schema ({isbn: string, title: string, author: string, available: boolean})[].

                Add to `books` using `books.add(new Book(
                    ISBN, title, author, available
                ))`

                available = true in each instance

                Real book titles, authors, and isbn only please.
                """
             */

        books.add(
            new Book(
                "9780743273565",
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                true
            )
        );
        books.add(new Book("9780451524935", "1984", "George Orwell", true));
        books.add(
            new Book(
                "9780141439518",
                "Pride and Prejudice",
                "Jane Austen",
                true
            )
        );
        books.add(
            new Book(
                "9780061120084",
                "To Kill a Mockingbird",
                "Harper Lee",
                true
            )
        );
        books.add(
            new Book(
                "9780316769488",
                "The Catcher in the Rye",
                "J.D. Salinger",
                true
            )
        );
        books.add(
            new Book("9780547928227", "The Hobbit", "J.R.R. Tolkien", true)
        );
        books.add(
            new Book(
                "9780618640157",
                "The Lord of the Rings",
                "J.R.R. Tolkien",
                true
            )
        );
        books.add(
            new Book("9780307277671", "The Road", "Cormac McCarthy", true)
        );
        books.add(
            new Book(
                "9780385472579",
                "Zen and the Art of Motorcycle Maintenance",
                "Robert M. Pirsig",
                true
            )
        );
        books.add(new Book("9780140449136", "The Odyssey", "Homer", true));
        books.add(
            new Book(
                "9780307387899",
                "The Kite Runner",
                "Khaled Hosseini",
                true
            )
        );
        books.add(
            new Book("9780060850524", "Brave New World", "Aldous Huxley", true)
        );
        books.add(
            new Book("9780143127550", "Sapiens", "Yuval Noah Harari", true)
        );
        books.add(
            new Book(
                "9780307476463",
                "The Girl with the Dragon Tattoo",
                "Stieg Larsson",
                true
            )
        );
        books.add(
            new Book("9780141182803", "Animal Farm", "George Orwell", true)
        );
        books.add(new Book("9781400033416", "Beloved", "Toni Morrison", true));
        books.add(
            new Book("9780062315007", "The Alchemist", "Paulo Coelho", true)
        );
        books.add(
            new Book("9780307346605", "Gone Girl", "Gillian Flynn", true)
        );
        books.add(
            new Book("9780374533557", "The Stranger", "Albert Camus", true)
        );
        books.add(new Book("9780441013593", "Dune", "Frank Herbert", true));
        books.add(
            new Book(
                "9780553386790",
                "A Game of Thrones",
                "George R.R. Martin",
                true
            )
        );
        books.add(
            new Book(
                "9780439708180",
                "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling",
                true
            )
        );
        books.add(
            new Book(
                "9780439139601",
                "Harry Potter and the Goblet of Fire",
                "J.K. Rowling",
                true
            )
        );
        books.add(
            new Book(
                "9780140449266",
                "Crime and Punishment",
                "Fyodor Dostoevsky",
                true
            )
        );
        books.add(
            new Book("9780142437230", "Moby-Dick", "Herman Melville", true)
        );
        books.add(
            new Book("9780140449273", "Anna Karenina", "Leo Tolstoy", true)
        );
        books.add(
            new Book(
                "9780141182575",
                "The Picture of Dorian Gray",
                "Oscar Wilde",
                true
            )
        );
        books.add(
            new Book(
                "9780140449181",
                "The Divine Comedy",
                "Dante Alighieri",
                true
            )
        );
        books.add(new Book("9780140444308", "The Republic", "Plato", true));
        books.add(
            new Book("9780140442106", "Meditations", "Marcus Aurelius", true)
        );
        books.add(
            new Book("9780140449150", "Leviathan", "Thomas Hobbes", true)
        );
        books.add(
            new Book("9780140449112", "The Prince", "Niccolo Machiavelli", true)
        );
        books.add(
            new Book(
                "9780140449334",
                "The Brothers Karamazov",
                "Fyodor Dostoevsky",
                true
            )
        );
        books.add(
            new Book("9780140447927", "War and Peace", "Leo Tolstoy", true)
        );
        books.add(
            new Book("9780141439600", "Jane Eyre", "Charlotte Bronte", true)
        );
        books.add(
            new Book("9780141439723", "Wuthering Heights", "Emily Bronte", true)
        );
        books.add(
            new Book("9780140444353", "Les Miserables", "Victor Hugo", true)
        );
        books.add(
            new Book("9780307265432", "The Da Vinci Code", "Dan Brown", true)
        );
        books.add(
            new Book("9780307743657", "Angels & Demons", "Dan Brown", true)
        );
        books.add(new Book("9780307588371", "Inferno", "Dan Brown", true));
        books.add(
            new Book(
                "9780062024039",
                "The Fault in Our Stars",
                "John Green",
                true
            )
        );
        books.add(
            new Book("9780140187396", "Of Mice and Men", "John Steinbeck", true)
        );
        books.add(
            new Book(
                "9780061122415",
                "The Grapes of Wrath",
                "John Steinbeck",
                true
            )
        );
        books.add(
            new Book(
                "9780307389732",
                "The Girl on the Train",
                "Paula Hawkins",
                true
            )
        );
        books.add(new Book("9780062315007", "Life of Pi", "Yann Martel", true));
        books.add(
            new Book(
                "9780140283297",
                "The Sun Also Rises",
                "Ernest Hemingway",
                true
            )
        );
        books.add(
            new Book(
                "9780140449266",
                "The Count of Monte Cristo",
                "Alexandre Dumas",
                true
            )
        );
        books.add(new Book("9780140449181", "The Trial", "Franz Kafka", true));
        books.add(
            new Book("9780142437230", "The Metamorphosis", "Franz Kafka", true)
        );
        books.add(new Book("9780141182636", "Catch-22", "Joseph Heller", true));
        books.add(
            new Book(
                "9780553573404",
                "A Clash of Kings",
                "George R.R. Martin",
                true
            )
        );
        books.add(
            new Book(
                "9780553573428",
                "A Storm of Swords",
                "George R.R. Martin",
                true
            )
        );
        books.add(
            new Book(
                "9780439023528",
                "The Hunger Games",
                "Suzanne Collins",
                true
            )
        );
        books.add(
            new Book(
                "9780375826696",
                "The Lightning Thief",
                "Rick Riordan",
                true
            )
        );
        books.add(new Book("9780142407332", "The Giver", "Lois Lowry", true));
        books.add(
            new Book(
                "9780064404990",
                "The Lion, the Witch and the Wardrobe",
                "C.S. Lewis",
                true
            )
        );
        books.add(
            new Book(
                "9780060256654",
                "Where the Wild Things Are",
                "Maurice Sendak",
                true
            )
        );
        books.add(new Book("9780812993547", "The Martian", "Andy Weir", true));
        books.add(
            new Book(
                "9780062472103",
                "The Silent Patient",
                "Alex Michaelides",
                true
            )
        );
        books.add(
            new Book("9781250301697", "The Midnight Library", "Matt Haig", true)
        );
        books.add(
            new Book("9780316015844", "Twilight", "Stephenie Meyer", true)
        );
        books.add(new Book("9780140449198", "Dracula", "Bram Stoker", true));
        books.add(
            new Book("9780140449136", "Frankenstein", "Mary Shelley", true)
        );
        books.add(
            new Book("9780307887443", "Ready Player One", "Ernest Cline", true)
        );
        books.add(
            new Book(
                "9781455586691",
                "The Subtle Art of Not Giving a F*ck",
                "Mark Manson",
                true
            )
        );
        books.add(
            new Book("9780062457738", "Atomic Habits", "James Clear", true)
        );
        books.add(
            new Book(
                "9780812981605",
                "The Power of Habit",
                "Charles Duhigg",
                true
            )
        );
        books.add(
            new Book(
                "9780143039433",
                "Thinking, Fast and Slow",
                "Daniel Kahneman",
                true
            )
        );
        books.add(
            new Book(
                "9781593279509",
                "Eloquent JavaScript",
                "Marijn Haverbeke",
                true
            )
        );
        books.add(
            new Book(
                "9780131103627",
                "The C Programming Language",
                "Brian W. Kernighan and Dennis M. Ritchie",
                true
            )
        );
        books.add(
            new Book("9780132350884", "Clean Code", "Robert C. Martin", true)
        );
        books.add(
            new Book(
                "9780201633610",
                "Design Patterns",
                "Erich Gamma et al.",
                true
            )
        );
        books.add(
            new Book("9781491950296", "Fluent Python", "Luciano Ramalho", true)
        );
        books.add(
            new Book("9780134685991", "Effective Java", "Joshua Bloch", true)
        );
        books.add(
            new Book(
                "9780262033848",
                "Introduction to Algorithms",
                "Thomas H. Cormen et al.",
                true
            )
        );
        books.add(
            new Book(
                "9780134494166",
                "Computer Networking: A Top-Down Approach",
                "James F. Kurose",
                true
            )
        );
        books.add(
            new Book("9780307592736", "The Book Thief", "Markus Zusak", true)
        );
        books.add(
            new Book("9780385537858", "The Goldfinch", "Donna Tartt", true)
        );
        books.add(
            new Book(
                "9780062316097",
                "The Handmaid's Tale",
                "Margaret Atwood",
                true
            )
        );
        books.add(
            new Book(
                "9780525566151",
                "Where the Crawdads Sing",
                "Delia Owens",
                true
            )
        );
        books.add(
            new Book("9780441172719", "Children of Dune", "Frank Herbert", true)
        );
        books.add(new Book("9780553804577", "The Stand", "Stephen King", true));
        books.add(new Book("9780307743664", "Misery", "Stephen King", true));
        books.add(
            new Book(
                "9780140449266",
                "Great Expectations",
                "Charles Dickens",
                true
            )
        );
        books.add(
            new Book(
                "9780140449273",
                "A Tale of Two Cities",
                "Charles Dickens",
                true
            )
        );
        books.add(
            new Book("9780140449266", "Oliver Twist", "Charles Dickens", true)
        );
        books.add(
            new Book(
                "9780141187761",
                "One Hundred Years of Solitude",
                "Gabriel Garcia Marquez",
                true
            )
        );
        books.add(
            new Book(
                "9780061122415",
                "The Old Man and the Sea",
                "Ernest Hemingway",
                true
            )
        );
        books.add(
            new Book(
                "9780307474278",
                "The Girl Who Played with Fire",
                "Stieg Larsson",
                true
            )
        );
        books.add(
            new Book(
                "9780307949486",
                "The Girl Who Kicked the Hornet's Nest",
                "Stieg Larsson",
                true
            )
        );
        books.add(
            new Book("9780061122415", "East of Eden", "John Steinbeck", true)
        );
        books.add(
            new Book(
                "9780140283334",
                "The Little Prince",
                "Antoine de Saint-Exupery",
                true
            )
        );

        return books;
    }
}
