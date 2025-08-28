import java.util.*;

class Student {
    int id;
    String name;
    String department;
    double cgpa;

    Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------");
    }
}

public class StudentListExample {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(101, "Mahmud", "CSE", 3.75));
        arrayList.add(new Student(102, "Faujul", "EEE", 3.50));

        System.out.println("ArrayList Students:");
        for (Student s : arrayList) {
            s.display();
        }

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student(103, "Ayesha", "BBA", 3.80));
        linkedList.add(new Student(104, "Zahid", "CSE", 3.60));

        System.out.println("LinkedList Students:");
        for (Student s : linkedList) {
            s.display();
        }

        linkedList.addFirst(new Student(105, "Ismail", "CSE", 3.90));
        linkedList.addLast(new Student(106, "Rima", "English", 3.40));

        System.out.println("After addFirst() and addLast():");
        for (Student s : linkedList) {
            s.display();
        }
    }
}
