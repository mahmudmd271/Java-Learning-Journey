public class Student{
int id;
String name;
String department;
double cgpa;
static String university = "Southeast University";
static int count = 0;
Student(int id,String name, String department, double cgpa){
this.id = id;
this.name = name;
this.department = department;

this.cgpa = cgpa;
count++;
}
void displayDetails(){
System.out.println("University: "+university);
System.out.println("ID: "+id);
System.out.println("Name: "+name);
System.out.println("Department: "+department);
System.out.println("CGPA: "+cgpa);
}
static int getTotalStudent(){
return count;
}
public static void main(String[] args) {
Student s1 = new Student(101,"Nahid","CSE",3.55);
Student s2 = new Student(102,"Ismail","EEE",3.26);
s1.displayDetails();
System.out.println("");
s2.displayDetails();
System.out.println("Total number: "+Student.getTotalStudent());
}
}
