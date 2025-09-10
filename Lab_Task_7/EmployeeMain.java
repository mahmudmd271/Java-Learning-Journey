import java.util.ArrayList;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateTotalSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Base Salary: " + salary;
    }
}

class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String name, int id, double salary, double bonusPercentage) {
        super(name, id, salary);
        this.bonusPercentage = bonusPercentage;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateTotalSalary() {
        double bonus = getSalary() * bonusPercentage / 100;
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus Percentage: " + bonusPercentage + "%, Total Salary: " + calculateTotalSalary();
    }
}

class Engineer extends Employee {
    private double overtimePay;

    public Engineer(String name, int id, double salary, double overtimePay) {
        super(name, id, salary);
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateTotalSalary() {
        return getSalary() + overtimePay;
    }

    @Override
    public String toString() {
        return super.toString() + ", Overtime Pay: " + overtimePay + ", Total Salary: " + calculateTotalSalary();
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Manager manager = new Manager("Mahmud", 101, 5000, 10);
        Engineer engineer = new Engineer("Rakib", 102, 4000, 500);

        employees.add(manager);
        employees.add(engineer);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
