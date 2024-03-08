# Library Management System

This Java program simulates a simple Library Management System, allowing users to perform various operations related to books in a library. Users can view available books, add new books, issue books to users, return books, and display all books in the library.

## Book Class

The `Book` class represents a book in the library and contains the following attributes:

- `title`: Title of the book.
- `author`: Author of the book.
- `available`: Availability status of the book.

## Library Class

The `Library` class manages the collection of books and provides methods to perform library operations, including adding books, showing available books, issuing books, returning books, and displaying all books.

## How to Use

1. Run the program to start the Library Management System.
2. Follow the on-screen menu to perform various operations.
3. Use options such as showing available books, adding a book, issuing a book, returning a book, and displaying all books.
4. Exit the program when done.

## Example

```
Library Menu:
1. Show Available Books
2. Add a Book
3. Issue a Book
4. Return a Book
5. Display All Books
6. Exit
Enter your choice: 1

Available Books:
Book{title='The Great Gatsby', author='F. Scott Fitzgerald', available=true}
Book{title='To Kill a Mockingbird', author='Harper Lee', available=true}
Book{title='1984', author='George Orwell', available=true}

Library Menu:
1. Show Available Books
2. Add a Book
3. Issue a Book
4. Return a Book
5. Display All Books
6. Exit
Enter your choice: 2

Enter the title of the book: The Catcher in the Rye
Enter the author of the book: J.D. Salinger

Library Menu:
1. Show Available Books
2. Add a Book
3. Issue a Book
4. Return a Book
5. Display All Books
6. Exit
Enter your choice: 5

Books in the library:
Book{title='The Great Gatsby', author='F. Scott Fitzgerald', available=true}
Book{title='To Kill a Mockingbird', author='Harper Lee', available=true}
Book{title='1984', author='George Orwell', available=true}
Book{title='The Catcher in the Rye', author='J.D. Salinger', available=true}

...
```

Enjoy managing your library with this simple yet effective Library Management System! 📚