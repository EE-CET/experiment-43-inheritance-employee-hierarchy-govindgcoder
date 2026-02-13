import java.util.Scanner;

class Employee {
   String name;
   int age;
   long phoneNumber;
   String address;
   int salary;
   
   public void printSalary(){
       System.out.println(this.salary);
   }
}

// Create class Officer extends Employee
class Officer extends Employee {
    String specialization;
}
// Add 'specialization' attribute

// Create class Manager extends Employee
class Manager extends Employee {
    String department;
}
// Add 'department' attribute

public class EmployeeInheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // --- OFFICER INPUT ---
        // Create Officer object
        // Read name, age, phone, address, salary, specialization
        // Hint: Use sc.nextLine() for strings to capture spaces, sc.nextInt() for numbers.
        // Be careful with buffer clearing after nextInt()!
        Officer ofc = new Officer();
        ofc.name = sc.nextLine();
        ofc.age = sc.nextInt();
        sc.nextLine();
        ofc.phoneNumber = sc.nextLong();
        sc.nextLine();
        ofc.address = sc.nextLine();
        ofc.salary = sc.nextInt();
        sc.nextLine();
        ofc.specialization = sc.nextLine();
        // --- MANAGER INPUT ---
        // Create Manager object
        // Read name, age, phone, address, salary, department
        Manager mgr = new Manager();
        mgr.name = sc.nextLine();
        mgr.age = sc.nextInt();
        sc.nextLine();
        mgr.phoneNumber = sc.nextLong();
        sc.nextLine();
        mgr.address = sc.nextLine();
        mgr.salary = sc.nextInt();
        sc.nextLine();
        mgr.department = sc.nextLine();
        // --- OUTPUT ---
        // Print "Officer:"
        // Print officer details (one per line)
        System.out.print("Officer:\n"+ofc.name+"\n"+ofc.age+"\n"+ofc.phoneNumber+"\n"+ofc.address+"\n");
        ofc.printSalary();
        System.out.println(ofc.specialization);
        // Print "Manager:"
        
        // Print manager details (one per line)
        System.out.println("Manager:\n"+mgr.name+"\n"+mgr.age+"\n"+mgr.phoneNumber+"\n"+mgr.address);
        mgr.printSalary();
        System.out.print(mgr.department);

    }
}
