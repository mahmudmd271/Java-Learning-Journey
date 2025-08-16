public class Employee {
public static String companyName = "Infotech PLC";

public static String companyAddress = "Uttara, Dhaka";
public static int totalEmployee = 0;
private String name;
private String designation;
private int salary;
private int age;
public Employee(String name,String designation,int salary){
this.name = name;
this.designation = designation;
this.salary = salary;
totalEmployee++;
}
public void displayEmployeDetails(){
System.out.println("Name: "+name);
System.out.println("Designation: "+designation);
System.out.println("Salary: "+salary);
System.out.println("Compnay Name: "+companyName);
System.out.println("Company Address: "+companyAddress);
}
public static int getTotalEmployee() {
return totalEmployee;
}
public static void main(String[] args) {
Employee employee1 = new Employee("Mahmud","Manager",10000);
Employee employee2 = new Employee("Habib","Businesss",50000);
System.out.println("Employee 1 details:");
employee1.displayEmployeDetails();
System.out.println("");
System.out.println("Employee 2 details:");
employee2.displayEmployeDetails();
System.out.println("");
System.out.println("Total number of Employee: "+Employee.getTotalEmployee());
}
}
