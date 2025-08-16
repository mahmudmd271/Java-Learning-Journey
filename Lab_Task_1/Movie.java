public class Movie {
String title;
String genre;
String leadActor;
String director;
int releaseYear;
int rating;
String review;

void display(){
  System.out.println("");
  System.out.println("Title: "+title);
  System.out.println("Genre: "+genre);
  System.out.println("Lead-Actor: "+leadActor);
  System.out.println("Director: "+director);
  System.out.println("Release Year: "+releaseYear);
  System.out.println("Rating: "+rating);
}
void review(){
  review = (rating<5) ? "Not Good!" : "Good!";
  System.out.println("Review: "+review);
}

public static void main(String[] args) {
  Movie m1 = new Movie();
  m1.title = "Cats";
  m1.genre = "Fantasy";

  m1.leadActor = "Francesca Hayward";
  m1.director = "Tom Hooper";
  m1.releaseYear = 2019;
  m1.rating = 2;

  Movie m2 = new Movie();
  m2.title = "Cats";
  m2.genre = "Fantasy";
  m2.leadActor = "Francesca Hayward";
  m2.director = "Tom Hooper";
  m2.releaseYear = 2019;
  m2.rating = 6;

  System.out.println("Movie no.1:");
  m1.display();
  m1.review();
  System.out.println("");
  System.out.println("Movie no.2:");

  m2.display();
  m2.review();
}
}
