class information{
private String name;
private int age ;
private String gender;
private String address;
public String getName() {
return name;
}
public int getAge() {
return age;
}
public String getGender() {
return gender;
}
public String getAddress() {
return address;
}
public void setName(String name) {
this.name = name;
}
public void setAge(int age) {
this.age = age;
}

public void setGender(String gender) {
this.gender = gender;
}
public void setAddress(String address) {
this.address = address;
}
}
public class Person extends information{
public static void main(String[] args) {
Person p1 = new Person();
p1.setName("Mahmud");
p1.setAge(22);
p1.setGender("Male");
p1.setAddress("Uttara");
Person p2 = new Person();
p2.setName("Faujul");
p2.setAge(21);
p2.setGender("Male");
p2.setAddress("Mirpur");
System.out.println("Person 1:");
System.out.println("Name: "+p1.getName());
System.out.println("Age: "+p1.getAge());
System.out.println("Gender: "+p1.getGender());
System.out.println("Address: "+p1.getAddress());
System.out.println("");
System.out.println("Person 2:");
System.out.println("Name: "+p2.getName());
System.out.println("Age: "+p2.getAge());
System.out.println("Gender: "+p2.getGender());
System.out.println("Address: "+p2.getAddress());
System.out.println("");
}
}
