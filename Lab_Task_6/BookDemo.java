import java.util.*;

class Book {
    String title;
    String author;
    int year;
    static String genre = "Fiction";

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("-------------------");
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Book[] arr = {
            new Book("Dune", "Frank Herbert", 1965),
            new Book("Neuromancer", "William Gibson", 1984)
        };

        System.out.println("Books using Array:");
        for (Book b : arr) {
            b.display();
        }

        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(new Book("Foundation", "Isaac Asimov", 1951));
        arrayList.add(new Book("1984", "George Orwell", 1949));

        System.out.println("Books using ArrayList:");
        for (Book b : arrayList) {
            b.display();
        }

        LinkedList<Book> linkedList = new LinkedList<>();
        linkedList.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        linkedList.add(new Book("Brave New World", "Aldous Huxley", 1932));

        linkedList.addFirst(new Book("Snow Crash", "Neal Stephenson", 1992));

        System.out.println("Books using LinkedList:");
        for (Book b : linkedList) {
            b.display();
        }
    }
}
