package com.library;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("1. Add Book");
            System.out.println("2. View Available Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author:");
                    String author = scanner.nextLine();
                    Book newBook = new Book(title, author);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    library.viewAvailableBooks();
                    break;
                case 3:
                    System.out.println("Enter the title of the book you want to borrow:");
                    String borrowTitle = scanner.nextLine();
                    if (library.borrowBook(borrowTitle)) {
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Book not available or not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the title of the book you want to return:");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

