class Employee {
    protected String name;
    protected int id;
    protected double salary;
    protected String designation;

    public Employee() {
        this("Not Assigned", 0, 0.0, "Not Assigned");
    }

    public Employee(String name, int id) {
        this(name, id, 0.0, "Not Assigned");
    }

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public void showEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
        System.out.println("-------------------");
    }

    public void showEmployee(String message) {
        System.out.println(message);
        showEmployee();
    }
}

class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager() {
        super(); 
        this.department = "Not Assigned";
        this.teamSize = 0;
    }

    public Manager(String name, int id, double salary, String designation,
                   String department, int teamSize) {
        super(name, id, salary, designation); 
        this.department = department;
        this.teamSize = teamSize;
    }

    @Override
    public void showEmployee() {
        super.showEmployee(); 
        System.out.println("Department: " + this.department);
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("===================");
    }

    public void showEmployee(String message, boolean showOnlyManager) {
        System.out.println(message);
        if (showOnlyManager) {
            System.out.println("Department: " + this.department);
            System.out.println("Team Size: " + this.teamSize);
        } else {
            showEmployee();
        }
        System.out.println("-------------------");
    }
}

public class MainTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Faujul", 101);
        Employee e3 = new Employee("Mahmud", 102, 55000.50, "Software Engineer");

        Manager m1 = new Manager("Karim", 201, 80000.0, "Project Manager", "IT", 10);

        e1.showEmployee("Default Constructor Employee:");
        e2.showEmployee("Constructor with Name & ID:");
        e3.showEmployee("Constructor with All Properties:");

        m1.showEmployee(); 
        m1.showEmployee("Showing only Manager details:", true); 
    }
}