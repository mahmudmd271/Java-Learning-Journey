class information{
private String name;
private int id;
private double salary;
private String designation;
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
public String getDesignation() {
return designation;
}
public void setDesignation(String designation) {
this.designation = designation;
}
}

public class Employee extends information{
public static void main(String[] args) {
Employee e1 = new Employee();
e1.setName("Rakib");
e1.setId(101);
e1.setSalary(1000.00);
e1.setDesignation("Manager");
Employee e2 = new Employee();
e2.setName("Faujul");
e2.setId(201);
e2.setSalary(2000.00);
e2.setDesignation("IT specialist");
System.out.println("Employee 1:");
System.out.println("Name: "+e1.getName());
System.out.println("Id: "+e1.getId());
System.out.println("Salary: "+e1.getSalary());
System.out.println("Designation: "+e1.getDesignation());
System.out.println("");
System.out.println("Employee 2:");
System.out.println("Name: "+e2.getName());
System.out.println("Id: "+e2.getId());
System.out.println("Salary: "+e2.getSalary());

System.out.println("Designation: "+e2.getDesignation());
System.out.println("");
}
}
