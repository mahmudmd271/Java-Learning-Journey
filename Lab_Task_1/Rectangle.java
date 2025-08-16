public class Rectangle {
double length;
double width;
double perimeter()
{
return 2*(length+width);
}
double area()
{
return length*width;
}

void display(){
System.out.println("Length: "+length);
System.out.println("Width: "+width);
System.out.println("Perimeter: "+perimeter());
System.out.println("Area: "+area());
}
public static void main(String[] args) {
Rectangle r1 = new Rectangle();
r1.length=25;
r1.width=45;
System.out.println("Rectangle no.1:");
r1.display();
System.out.println("");
Rectangle r2 = new Rectangle();
r2.length=15;
r2.width=64;
System.out.println("Rectangle no.2:");
r2.display();
}
}
