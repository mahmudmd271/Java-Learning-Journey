public class Book {

static String genre;
public static int totalBook = 0;
private String title;
private String author;
private int year;

public Book(String title,String author,int year){
this.title = title;
this.author = author;
this.year = year;
totalBook++;
}
public void displayBookDetails(){
System.out.println("Title: "+title);
System.out.println("author: "+author);
System.out.println("Year: "+year);
}
public static int getTotalBook() {
return totalBook;
}
public static void main(String[] args) {
Book.genre = "Information_System";
Book Book1 = new Book("Introduction to Java","Robert Bruce",2005);
Book Book2 = new Book("Introduction to Networking","Josheph Howard",2003);
System.out.println("Book 1 details:");
Book1.displayBookDetails();
System.out.println("Genre: "+genre);
System.out.println("");
System.out.println("Book 2 details:");
Book2.displayBookDetails();
System.out.println("Genre: "+genre);
System.out.println("");
System.out.println("Total number of Book: "+Book.getTotalBook());
}
}
