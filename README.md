# Library-Management-System
Data Structures Final

## Running Instructions

To run the code you must compile all the classes and execute the Main.java file exemplified as follows:

1. clone [the repo](https://github.com/danielhamen-dev/Library-Management-System)
2. navigate to wherever you cloned the repo
3. set the current working directory to the `src` folder (e.g. with `cd src`)
4. compile all the working Java files with `javac *.java` or write the individual files for more safety
5. run the Main class with `java Main`

For example:
```bash
danielhamen@96:26:8a:98:b5:1e Downloads % git clone https://github.com/danielhamen-dev/Library-Management-System
Cloning into 'Library-Management-System'...
remote: Enumerating objects: 35, done.
remote: Counting objects: 100% (35/35), done.
remote: Compressing objects: 100% (28/28), done.
remote: Total 35 (delta 10), reused 27 (delta 4), pack-reused 0 (from 0)
Receiving objects: 100% (35/35), 12.76 KiB | 3.19 MiB/s, done.
Resolving deltas: 100% (10/10), done.
danielhamen@96:26:8a:98:b5:1e Downloads % cd Library-Management-System 
danielhamen@96:26:8a:98:b5:1e Library-Management-System % cat README.md
# Library-Management-System
Data Structures Final

## Running Instructions

To run the code you must compile all the classes and execute the Main.java file exemplified as follows:

1. clone [the repo](https://github.com/danielhamen-dev/Library-Management-System)
2. navigate to wherever you cloned the repo
3. set the current working directory to the `src` folder (e.g. with `cd src`)
4. compile all the working Java files with `javac *.java` or write the individual files for more safety
5. run the Main class with `java Main`
danielhamen@96:26:8a:98:b5:1e Library-Management-System % cd src
danielhamen@96:26:8a:98:b5:1e src % javac *.java
danielhamen@96:26:8a:98:b5:1e src % java Main
Library Management System
Added 92 books to the Library Management System

=== Library Management CLI ===
1. Search Book
2. Borrow Book
3. Return Book
4. Add Book
5. Exit
Choose option: 2
Enter ISBN to borrow: 9780439139601
Book borrowed successfully.

=== Library Management CLI ===
1. Search Book
2. Borrow Book
3. Return Book
4. Add Book
5. Exit
Choose option: 2
Enter ISBN to borrow: 9780439139601
Book unavailable or does not exist.

=== Library Management CLI ===
1. Search Book
2. Borrow Book
3. Return Book
4. Add Book
5. Exit
Choose option: 3
Enter ISBN to return: 9780439139601
Book returned successfully.

=== Library Management CLI ===
1. Search Book
2. Borrow Book
3. Return Book
4. Add Book
5. Exit
Choose option: 5
Exiting system...
danielhamen@96:26:8a:98:b5:1e src % 

```
