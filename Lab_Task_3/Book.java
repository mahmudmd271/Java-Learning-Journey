import java.util.*;
public class Book {
private static int count = 0;
private static String genre;
private String title;
private String author;

private int year;

public Book(String title, String author, int year) {
this.title = title;
this.author = author;
this.year = year;
count++;
}

public void displayDetails() {
System.out.println("Genre: " + genre);
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Year: " + year);
}

public static int getCount() {
return count;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Genre: ");
genre = sc.nextLine();
Book[] books = new Book[3];
for (int i = 0; i < 3; i++) {
System.out.println("\nEnter details for Book " + (i + 1) + ":");
System.out.print("Enter Title: ");
String title = sc.nextLine();
System.out.print("Enter Author: ");
String author = sc.nextLine();
System.out.print("Enter Year: ");
int year = sc.nextInt();
sc.nextLine();
books[i] = new Book(title, author, year);

}
for (int i = 0; i < 3; i++) {
System.out.println("\nBook " + (i + 1) + " Details:");
books[i].displayDetails();
}
System.out.println("\nTotal number of Books: " + Book.getCount());
sc.close();
}
}
