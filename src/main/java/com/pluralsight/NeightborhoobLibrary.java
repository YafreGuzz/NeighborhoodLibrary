package com.pluralsight;
import java.util.Scanner;

public class NeightborhoobLibrary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        Book b1 = new Book(1, "12", "The Yaya Book, The Best Book", false, "Unknown");
        Book b2 = new Book(2, "23", "The Brian Smith Book, The Best Book", false, "Unknown");
        Book b3 = new Book(3, "34", "The Chris Book, The Best Book", false, "Unknown");
        Book b4 = new Book(4, "45", "The Hibba Book, The Best Book", false, "Unknown");
        Book b5 = new Book(5, "56", "The Yordiana Book, The Best Book", false, "Unknown");
        Book b6 = new Book(6, "67", "The Erika Book, The Best Book", false, "Unknown");
        Book b7 = new Book(7, "78", "The Kaila Book, The Best Book", false, "Unknown");
        Book b8 = new Book(8, "89", "The Alicia Book, The Best Book", false, "Unknown");
        Book b9 = new Book(9, "910", "The Nicholas Book, The Best Book", false, "Unknown");
        Book b10 = new Book(10, "1011", "The Paul Book, The Best Book", false, "Unknown");
        Book b11 = new Book(11, "1112", "The Katherine Book, The Best Book", false, "Unknown");
        Book b12 = new Book(12, "1213", "The Houke Book, The Best Book", false, "Unknown");
        Book b13 = new Book(13, "1314", "The Samuel Book, The Best Book", false, "Unknown");
        Book b14 = new Book(14, "1415", "The Oscar Book, The Best Book", false, "Unknown");
        Book b15 = new Book(15, "1516", "The Tracy Book, The Best Book", false, "Unknown");
        Book b16 = new Book(16, "1617", "The Courtezz Book, The Best Book", false, "Unknown");
        Book b17 = new Book(17, "1718", "The Justin Book, The Best Book", false, "Unknown");
        Book b18 = new Book(18, "1819", "The Kwad Book, The Best Book", false, "Unknown");
        Book b19 = new Book(19, "1920", "The Seth Book, The Best Book", false, "Unknown");
        Book b20 = new Book(20, "2021", "The Anthony Book, The Best Book", false, "Unknown");

        Book[] books = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20};

        System.out.println("Welcome to the Neighborhood Library");
        System.out.println("This are all our books: \n");
        printAllBooks(books);

        System.out.println("\n\n1. Show Available Books");
        System.out.println("2. Show Unavailable Books");
        System.out.println("3. Exit");
        System.out.print("Choose: ");

        int decision = scanner.nextInt();
        boolean endOfCode = true;

        while(endOfCode)
        {
            switch (decision)
            {
                case 1: availableBooks(books);
                        System.out.println("Would you like to Check out a book?");
                        String pickABook = scanner.nextLine();
                        if(pickABook.equalsIgnoreCase("yes"))
                        {
                            System.out.println("What's your name?");
                            String name = scanner.nextLine();

                            System.out.println("Enter the ID number of the book you want: ");
                            String input = scanner.nextLine();
                            int inputNumber = Integer.parseInt(input);

                            books[inputNumber - 1].checkOut(name);
                        }
                        break;
                case 2: unavailableBooks(books);
                        break;
                case 3:
                        break;

            }
        }
//        System.out.println("Please pick a book from the library: \n");
//        printAllBooks(books);

//        boolean bookFound = false;
//
//        while (!bookFound)
//        {
//            System.out.println("Enter the ID number of the book you want: ");
//            String input = scanner.nextLine();
//            int inputNumber = Integer.parseInt(input);
//
//            Book theBook = findBookById(inputNumber, books);
//            if(theBook != null ) bookFound = true;
//
//            if (bookFound)
//            {
//                System.out.println("I found it!");
//                System.out.println(theBook);
//
//                System.out.print("Would you like to check out? Yes/No ");
//                String decision = scanner.nextLine();
//
//                if (decision.equalsIgnoreCase("Yes"))
//                {
//                    System.out.print("Enter the name you would like to check out with: ");
//                    String name = scanner.nextLine();
//
//                    books[inputNumber - 1].checkOut(name);
//                }
//            }
//            else
//            {
//                System.out.println("Sorry, I don't have that book id...");
//            }
//        }
    }
    static void printAllBooks(Book[] books)
    {
        for(Book i : books)
        {
            System.out.println(i.getId() + ": " + i.getTitle());
        }
    }

    static Book findBookById(int id, Book[] books)
    {
        for (Book b : books)
        {
            if (id == b.getId())
            {
                return b;
            }
        }
        return null;
    }
    static  void availableBooks(Book[] books)
    {
        for(Book i : books)
        {
            if(i.getCheckedOut(false))
            {
                System.out.println(i.getId() + ": " + i.getTitle());
            }
        }
    }
    static  void unavailableBooks(Book[] books)
    {
        for(Book i : books)
        {
            if(i.getCheckedOut(true))
            {
                System.out.println(i.getId() + ": " + i.getTitle());
            }
        }
    }
}