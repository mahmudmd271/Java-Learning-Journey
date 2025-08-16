import java.util.*;
public class Student {
private int id;
private String name;
private String department;
private double cgpa;

static String university;
private static int count = 0;
Student(int id, String name, String department, double cgpa) {
this.id = id;
this.name = name;
this.department = department;
this.cgpa = cgpa;
count++;
}
void displayDetails() {
System.out.println("University: " + university);
System.out.println("ID: " + id);
System.out.println("Name: " + name);
System.out.println("Department: " + department);
System.out.println("CGPA: " + cgpa);
System.out.println("");
}
static int getTotalStudents() {
return count;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter University Name: ");
university = sc.nextLine();
Student[] students = new Student[3];
for (int i = 0; i < 3; i++) {
System.out.println("\nEnter details for Student " + (i + 1) + ":");
System.out.print("ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Name: ");

String name = sc.nextLine();
System.out.print("Department: ");
String department = sc.nextLine();
System.out.print("CGPA: ");
double cgpa = sc.nextDouble();
sc.nextLine();
students[i] = new Student(id, name, department, cgpa);
}
for (int i = 0; i < 3; i++) {
System.out.println("\nStudent " + (i + 1) + " Details:");
students[i].displayDetails();
}
System.out.println("Total number of students: " + getTotalStudents());
sc.close();
}
}
