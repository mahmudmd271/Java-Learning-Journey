class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    public Person() {
        this("Unknown", 0, "Not specified", "Not specified");
    }

    public Person(String name, int age) {
        this(name, age, "Not specified", "Not specified");
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
        System.out.println("-------------------");
    }

    public void displayInfo(String message) {
        System.out.println(message);
        displayInfo();
    }
}

class Student extends Person {
    private String studentId;
    private String department;

    public Student() {
        super(); 
        this.studentId = "Not assigned";
        this.department = "Not assigned";
    }

    public Student(String name, int age, String gender, String address,
                   String studentId, String department) {
        super(name, age, gender, address); 
        this.studentId = studentId;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Department: " + this.department);
        System.out.println("===================");
    }

    public void displayInfo(String message, boolean showStudentOnly) {
        System.out.println(message);
        if (showStudentOnly) {
            System.out.println("Student ID: " + this.studentId);
            System.out.println("Department: " + this.department);
        } else {
            displayInfo();
        }
        System.out.println("-------------------");
    }
}

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Faujul", 21);
        Student s1 = new Student("Mahmud", 20, "Male", "Dhaka", "799", "CSE");

        p1.displayInfo("Default Constructor Person:");
        p2.displayInfo("Constructor with Name & Age:");

        s1.displayInfo(); 
        s1.displayInfo("Showing only student details:", true); 
    }
}