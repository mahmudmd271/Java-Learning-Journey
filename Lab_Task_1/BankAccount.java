public class BankAccount {
int accountNumber;
double balance;

void display()
{
System.out.println("Account Number: "+accountNumber);
System.out.println("Previous Balance: "+balance);
}
void deposit(double add)
{
add = balance + add;
System.out.println("New balance: "+add);
}
void withdraw(double substract)
{
substract = balance - substract;

System.out.println("New balance: "+substract);
}

public static void main(String[] args) {

BankAccount acc1 = new BankAccount();
acc1.accountNumber = 101;
acc1.balance = 1000;
acc1.display();
acc1.deposit(500);

System.out.println("");

BankAccount acc2 = new BankAccount();
acc2.accountNumber = 201;
acc2.balance = 3000;
acc2.display();
acc2.withdraw(300);

System.out.println("");
}
}
