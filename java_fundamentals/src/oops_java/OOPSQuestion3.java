package oops_java;

import java.util.*;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class OOPSQuestion3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Author Name:");
        String authorname = in.nextLine();

        System.out.println("Enter Author Email:");
        String authoremail = in.nextLine();

        System.out.println("Enter Author Gender (M/F):");
        char authorgender = in.next().charAt(0);
        in.nextLine(); // Important: consume leftover newline

        Author author = new Author(authorname, authoremail, authorgender);

        System.out.println("Enter Book Name:");
        String bookname = in.nextLine();

        System.out.println("Enter Book Price:");
        double bookprice = in.nextDouble();

        System.out.println("Enter Quantity in Stock:");
        int qtyInStock = in.nextInt();

        Book book = new Book(bookname, author, bookprice, qtyInStock);

        System.out.println("\n--- Book Details ---");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());;
       

       
}
}
